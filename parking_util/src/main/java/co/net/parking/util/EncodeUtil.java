/**
 * 
 */
package co.net.parking.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * <b>Descripcion:</b> Clase que <br/>
 * <b>Módulo:</b> Parking SIP- <br/>
 *
 * @author jbedoya <jheyson.bedoya@parking.net.co>
 */
public class EncodeUtil {

	public static String encodeMD5(String text) {

		if (text == null || text.length() == 0) {
			throw new IllegalArgumentException("String to encript cannot be null or zero length");
		}
		MessageDigest digester = null;
		try {
			digester = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		digester.update(text.getBytes());
		byte[] hash = digester.digest();
		StringBuffer hexString = new StringBuffer();
		for (int i = 0; i < hash.length; i++) {
			if ((0xff & hash[i]) < 0x10) {
				hexString.append("0" + Integer.toHexString((0xFF & hash[i])));
			} else {
				hexString.append(Integer.toHexString(0xFF & hash[i]));
			}
		}
		return hexString.toString();

	}


	/* Retorna un hash a partir de un tipo y un texto */
	public static String getHash(String txt, String hashType) {
		try {
			java.security.MessageDigest md = java.security.MessageDigest.getInstance(hashType);
			byte[] array = md.digest(txt.getBytes());
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < array.length; ++i) {
				sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1, 3));
			}
			return sb.toString();
		} catch (java.security.NoSuchAlgorithmException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	/* Retorna un hash a partir de un tipo y un texto */
	public static byte[] getHashByte(byte[] txt, String hashType) {
		try {
			java.security.MessageDigest md = java.security.MessageDigest.getInstance(hashType);
			return md.digest(txt);
		} catch (java.security.NoSuchAlgorithmException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}


	/* Retorna un hash SHA1 a partir de un texto */
	public static String sha1(String txt) {
		return getHash(txt, "SHA1");
	}

}
