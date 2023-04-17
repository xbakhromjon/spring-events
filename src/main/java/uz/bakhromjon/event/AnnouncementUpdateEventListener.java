package uz.bakhromjon.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AnnouncementUpdateEventListener {
    @EventListener
    public void handleAnnouncementUpdateEvent(AnnouncementUpdateEvent event) {
        System.out.println("Received spring custom event - " + event.getMessage());
    }

}

