/**
 *
 */
package co.net.parking.util;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.auth0.jwt.JWTExpiredException;
import com.auth0.jwt.JWTSigner;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.JWTVerifyException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import co.net.parking.enums.RolEnum;
import co.net.parking.pojos.Usuario;

/**
 * <b>Descripcion:</b> Clase que <br/>
 * <b>Módulo:</b> Parking SIP- <br/>
 *
 * @author jbedoya <jbedoya@heinsohn.com.co>
 */
public class TokenUtil {


    /**
     *
     * @param usuario
     * @param minExp cantidad de minutos de expiracion del token
     * @return
     */
    public static String generarToken(Usuario usuario,int minExp){
        final long iat = System.currentTimeMillis() / 1000l; // issued at claim
        final long exp = iat + (60L * minExp ); // expires claim. In this case the token expires in 60 seconds

        final JWTSigner signer = new JWTSigner(ConstantesUtil.CLAVE_TOKEN);
        final HashMap<String, Object> claims = new HashMap<String, Object>();
        claims.put("iss", usuario.getIdUsuario());
        claims.put("exp", exp);
        claims.put("iat", iat);
        claims.put("nombre",  usuario.getNombre());
        claims.put("roles",  usuario.getRoles());
        return signer.sign(claims);

    }

    public static Usuario validarToken(String  token) throws JWTExpiredException{
        try {
            final JWTVerifier verifier = new JWTVerifier(ConstantesUtil.CLAVE_TOKEN);
            final Map<String,Object> claims= verifier.verify(token);
            Usuario user = new Usuario();
            user.setIdUsuario(claims.get("iss").toString());
            user.setNombre(claims.get("nombre").toString());
            System.out.println(claims.get("roles").toString());
            if(!claims.get("roles").toString().equals("") ) {
                GsonBuilder gsonBuilder = new GsonBuilder();
                Gson gson = gsonBuilder.create();
                TypeToken<List<RolEnum>> tokentype = new TypeToken<List<RolEnum>>(){};
                List<RolEnum> roles = gson.fromJson(claims.get("roles").toString(), tokentype.getType());
                user.setRoles(roles);
            }

            return user;
        }catch(JWTExpiredException e){
           throw e;
        }catch (JWTVerifyException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (SignatureException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }



}
