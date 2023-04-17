package uz.bakhromjon.event;

import org.springframework.context.ApplicationEvent;

import java.time.LocalDateTime;

public class AnnouncementUpdateEvent extends ApplicationEvent {
    private String message;
    private LocalDateTime occurredAt;

    private Long userId;

    public AnnouncementUpdateEvent(Object source, String message, LocalDateTime occurredAt, Long userId) {
        super(source);
        this.message = message;
        this.occurredAt = occurredAt;
        this.userId = userId;
    }

    public String getMessage() {
        return message;
    }
}
