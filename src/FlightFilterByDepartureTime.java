import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

class FlightFilterByDepartureTime implements FlightFilter {
    @Override
    public List<Flight> filter(List<Flight> flights) {
        LocalDateTime now = LocalDateTime.now();
        return flights.stream()
                .filter(flight -> flight.getSegments().get(0).getDeparture().isAfter(now))
                .collect(Collectors.toList());
    }
}
