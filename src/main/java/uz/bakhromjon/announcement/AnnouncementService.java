package uz.bakhromjon.announcement;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.bakhromjon.event.AnnouncementUpdateEventPublisher;

@Service
@Slf4j
public class AnnouncementService {
    @Autowired
    private AnnouncementUpdateEventPublisher announcementUpdatedEventPublisher;

    public void changeStatus() {
        log.info("Announcement status changed");
        announcementUpdatedEventPublisher.publishCustomEvent("Announcement status changed");
    }
}
