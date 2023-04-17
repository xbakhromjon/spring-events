package uz.bakhromjon.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class AnnouncementUpdateEventPublisher {
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void publishCustomEvent(final String message) {
        System.out.println("Publishing custom event.");
        AnnouncementUpdateEvent customSpringEvent = new AnnouncementUpdateEvent(this, message, LocalDateTime.now(), 1L);
        applicationEventPublisher.publishEvent(customSpringEvent);
    }
}
