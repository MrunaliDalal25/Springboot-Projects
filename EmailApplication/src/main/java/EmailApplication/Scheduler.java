package EmailApplication;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component
public class Scheduler {
	@Scheduled(cron="*/5 * * * * MON-FRI")
    public void doSomething() { // this will execute on weekdays
		
		// @Scheduled(cron = "*/5 * * * * *")
    //public void currentTime() {
       // log.info("Current Time      = {}", dateFormat.format(new Date()));
    }
}


