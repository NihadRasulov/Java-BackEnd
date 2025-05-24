package MentorLessons.Month4.Lesson13;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Objects;

public final class Event {

    private final String title;
    private final String description;
    private final LocalDateTime localDateTime;
    private final Duration duration;

    public Event(String title, String description, LocalDateTime localDateTime, Duration duration) {
        this.title = title;
        this.description = description;
        this.localDateTime = localDateTime;
        this.duration = duration;
    }

    @Override
    public String toString() {
            return "Event{title='%s', description='%s', localDateTime=%s, duration=%s}"
                    .formatted(title, description, localDateTime, Objects.nonNull(duration) ? duration.toString().replace("PT",""):null);
    }

}
