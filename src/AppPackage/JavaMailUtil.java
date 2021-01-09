
package AppPackage;

import java.net.PasswordAuthentication;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Kelompok Queue
 */
public class JavaMailUtil {
    
    public static void sendMail(String recepient, String nama, String no) throws Exception{
        System.out.println("Preparing To Send email");
        Properties properties = new Properties();
        
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.port","587");
        
        final String myAcountEmail = "kelompokqueue2537@gmail.com";
        final String password = "law089658255";
        
        Session session = Session.getInstance(properties,new Authenticator() {
            @Override
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                return new javax.mail.PasswordAuthentication(myAcountEmail, password);
            }
});
        Message message = prepareMessage(session, myAcountEmail, recepient, nama, no);
        
        Transport.send(message);
        System.out.println("Message sent Succesfuly");
        
    }
    
    private static Message prepareMessage(Session session, String myAcountEmail, String recepient, String nama, String no){
        try{
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(myAcountEmail));
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
        message.setSubject("BUKTI ANTRIAN");
        message.setText("Halo "+nama+",\n\nSelamat! Pendaftaran Data antrian kamu telah Berhasil. Email ini adalah bukti bahwa kamu telah mengantri."
                + " \n\nNo Antrian Anda : "+no+"\n\n\nSELANJUTNYA ? \nKamu harus bersabar menunggu sampai nomor antrianmu dipanggil dan tunjukan Email ini saat dipanggil."
                + "\n\nJika Antrianmu Bermasalah atau mengalami kendala, kamu dapat menghubungi kami di nomor 0895611453834."
                + "\n\nTerima kasih untuk perhatiannya.");
        return message;
    }catch (Exception ex) {
            Logger.getLogger(JavaMailUtil.class.getName()).log(Level.SEVERE, null, ex);
    }
        return null;
    }
}
