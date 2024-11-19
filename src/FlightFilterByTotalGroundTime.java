import javax.swing.text.Segment;
import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

class FlightFilterByTotalGroundTime implements FlightFilter {
    @Override
    public List<Flight> filter(List<Flight> flights) {
        return flights.stream()
                .filter(flight -> {
                    Duration totalGroundTime = Duration.ZERO;
                    List<Segment> segments = flight.getSegments();
                    for (int i = 0; i < segments.size() - 1; i++) {
                        totalGroundTime = totalGroundTime.plus(Duration.between(segments.get(i).getArrival(), segments.get(i + 1).getDeparture()));
                    }
                    return totalGroundTime.toHours() <= 2;
                })
                .collect(Collectors.toList());
    }
}
