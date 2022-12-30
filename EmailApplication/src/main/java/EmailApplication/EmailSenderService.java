package EmailApplication;

import org.apache.logging.log4j.message.SimpleMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.ProjectedPayload;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {
 @Autowired
	    private JavaMailSender mailSender;

	    public void sendSimpleEmail(String toEmail,
	                                String subject,
	                                String body) {
	        SimpleMailMessage message = new SimpleMailMessage();
	        message.setFrom("mrunali.dalal25@gmail.com");
	        message.setTo("mrunalidalal20@gmail.com");
	        message.setText("body");
	        message.setSubject(subject);
	        mailSender.send(message);
	        System.out.println("Mail Sent successfully...");


	    }

	
}
