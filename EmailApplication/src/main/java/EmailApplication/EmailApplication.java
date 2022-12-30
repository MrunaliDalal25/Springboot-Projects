package EmailApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.mapping.MappingException;

@SpringBootApplication
public class EmailApplication {
		@Autowired
		private EmailSenderService senderService;
		public static void main(String[] args) {
			SpringApplication.run(EmailApplication.class, args);
		}
		@EventListener(ApplicationReadyEvent.class)
		public void triggerMail() throws MappingException {
			senderService.sendSimpleEmail("mrunalidalal20@gmail.com",
					"This is email body",
					"This is email subject");

		}
	}


