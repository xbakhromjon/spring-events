package uz.bakhromjon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import uz.bakhromjon.announcement.AnnouncementService;

@SpringBootApplication
public class EventApplication implements CommandLineRunner {
    @Autowired
    private AnnouncementService announcementService;

    public static void main(String[] args) {
        SpringApplication.run(EventApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        announcementService.changeStatus();
    }
}