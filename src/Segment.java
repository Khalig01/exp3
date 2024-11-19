import java.time.LocalDateTime;

public class Segment {
    private final LocalDateTime departure;
    private final LocalDateTime arrival;

    public Segment(LocalDateTime departure, LocalDateTime arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public LocalDateTime getDeparture() {
        return departure;
    }

    public LocalDateTime getArrival() {
        return arrival;
    }
}

