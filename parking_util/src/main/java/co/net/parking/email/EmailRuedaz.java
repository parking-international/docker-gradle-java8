/**
 *
 */
package co.net.parking.email;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;



/**
 * <b>Descripcion:</b> Clase que envia un correo<br/>
 * <b>M�dulo:</b> Parking SIP- <br/>
 *
 * @author Parking
 */
public class EmailRuedaz {

    private static final String EM_TITULO = "{title}";
    private static final String EM_CONTENIDO = "{content}";
    private static final String EM_PIE_PAGINA = "{footer}";
    private static final String EM_HOST = "smtp.office365.com";
    private static final String EM_PORT = "587";
    private static final String EM_REMITENTE = "developer@ruedaz.com";
    private static final String EM_PASSWORD = "Bol16544";

    private String contenido;
    private List<String> destinatarios;
    private String asunto;
    private StringBuilder plantilla;  
    
    


    public EmailRuedaz(String asunto){
        this.asunto = asunto;
        this.destinatarios = new ArrayList<>();
        this.contenido = "";
        cargarPlantilla();
    }

    public void cargarPlantilla(){
        plantilla = new StringBuilder();
        BufferedReader br = null;
        try {
            InputStream in = getClass().getResourceAsStream("/plantilla-emailRuedaz.html");
            br = new BufferedReader(new InputStreamReader(in));
            while ((br.readLine()) != null) {
                if (plantilla.length() > 0) {
                    plantilla.append("\n");
                }
                //plantilla.append(line);
            }
            plantilla.append(EM_CONTENIDO);
            plantilla.append("<p><a href=\"http://www.ruedaz.com.co\">www.ruedaz.com.co</a></p>");
        	
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void enviarEmail(){
        try {

            Properties props =new Properties();
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", EM_HOST);
            props.put("mail.smtp.port", EM_PORT);
           // propiedades.put("mail.transport.protocol", "smtps");
           

            Session sesion = Session.getInstance(props, new Authenticator() {

                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(EM_REMITENTE, EM_PASSWORD);
                }

            });
            Message message = new MimeMessage(sesion);
            message.setFrom(new InternetAddress(EM_REMITENTE));

            for (String destinatario : destinatarios) {
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
            }

            message.setSubject(this.asunto);

            MimeMultipart multipart = new MimeMultipart("related");

            String textoHtml =  plantilla.toString().replace(EM_TITULO, asunto);
            textoHtml = textoHtml.replace(EM_CONTENIDO,contenido);
            textoHtml = textoHtml.replace(EM_PIE_PAGINA,"<b>PDT:Favor no conteste en esta cuenta de correo, es de uso exclusivo para notificaciones</>");


            DataSource fds = null;
            try {
                fds = new FileDataSource(getImage());
            } catch (IOException e) {
                e.printStackTrace();
            }

    		
            BodyPart imagePart = new MimeBodyPart();
            imagePart.setContent(textoHtml, "text/html");
            multipart.addBodyPart(imagePart);

            imagePart = new MimeBodyPart();
            imagePart.setDataHandler(new DataHandler(fds));
            imagePart.setHeader("Content-ID", "<LogoFirma>");
            multipart.addBodyPart(imagePart);
            
            message.setContent(multipart);
            Transport.send(message);
         } catch (MessagingException e) {
            throw new RuntimeException(e);
         }
    }

    public void enviarEmailAdjunto(String tituloAdjunto, String ruta){
    	  try {

              Properties props =new Properties();
              props.put("mail.smtp.auth", "true");
              props.put("mail.smtp.starttls.enable", "true");
              props.put("mail.smtp.host", EM_HOST);
              props.put("mail.smtp.port", EM_PORT);
             // propiedades.put("mail.transport.protocol", "smtps");
             

              Session sesion = Session.getInstance(props, new Authenticator() {

                  @Override
                  protected PasswordAuthentication getPasswordAuthentication() {
                      return new PasswordAuthentication(EM_REMITENTE, EM_PASSWORD);
                  }

              });
              Message message = new MimeMessage(sesion);
              message.setFrom(new InternetAddress(EM_REMITENTE));

              for (String destinatario : destinatarios) {
                  message.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
              }

              message.setSubject(this.asunto);

              MimeMultipart multipart = new MimeMultipart("related");

              String textoHtml =  plantilla.toString().replace(EM_TITULO, asunto);
              textoHtml = textoHtml.replace(EM_CONTENIDO,contenido);
              textoHtml = textoHtml.replace(EM_PIE_PAGINA,"<b>PDT:Favor no conteste en esta cuenta de correo, es de uso exclusivo para notificaciones</>");


              DataSource fds = null;
              try {
                  fds = new FileDataSource(getImage());
              } catch (IOException e) {
                  e.printStackTrace();
              }

      		
              BodyPart imagePart = new MimeBodyPart();
              imagePart.setContent(textoHtml, "text/html");
              multipart.addBodyPart(imagePart);

              imagePart = new MimeBodyPart();
              imagePart.setDataHandler(new DataHandler(fds));
              imagePart.setHeader("Content-ID", "<LogoFirma>");
              multipart.addBodyPart(imagePart);
              
            // Pdf de recibo adjunto
            //BodyPart adjunto = new MimeBodyPart();
    		//adjunto.setDataHandler(new DataHandler(new FileDataSource(ruta)));
    		//adjunto.setFileName(tituloAdjunto);
    		//multipart.addBodyPart(adjunto);
    		
                    
            message.setContent(multipart);
            Transport.send(message);
         } catch (MessagingException e) {
            throw new RuntimeException(e);
         }
    }
    public List<String> getDestinatarios() {
        return destinatarios;
    }

    public void setDestinatarios(List<String> destinatarios) {
        this.destinatarios = destinatarios;
    }

    public void addDestinatarios(String destinatario) {
        this.destinatarios.add(destinatario);
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public void crearTabla(String[] columnas,String[][] registros){

        //se contruye el encabezado de la tabla
        contenido += "<table>";
        contenido += "<tr>";
        for (String columna : columnas) {
            contenido += "<th>"+columna+"</th>";
        }
        contenido += "</tr>";

        //se asignan los registros de la tabla
        int i = 1;
        for (String[] list : registros) {
            if(i%2 == 0){
                contenido += "<tr>";
            }else{
                contenido += "<tr  bgcolor='#f2f2f2'>";
            }

            for (String valor : list) {
                contenido += "<td>"+valor+"</td>";
            }
            contenido += "</tr>";
            i++;
        }

        contenido += "</table>";
    }

    private File getImage() throws IOException {
        InputStream in = getClass().getResourceAsStream("/logoRuedaz.png");
        File tempFile = File.createTempFile("logoRuedaz", ".png");
        tempFile.deleteOnExit();

        FileOutputStream fout = null;

        try {

            fout = new FileOutputStream(tempFile);
            int c;

            while ((c = in.read()) != -1) {
                fout.write(c);
            }

        }finally {
            if (in != null) {
                in.close();
            }
            if (fout != null) {
                fout.close();
            }
        }
        return tempFile;
    }

    public void agregarParrafo(String texto){
        contenido += "<p>"+texto+"</p>";
    }
}
