import java.util.List;
import java.util.stream.Collectors;

 class FlightFilterByArrivalBeforeDeparture implements FlightFilter {
    @Override
    public List<Flight> filter(List<Flight> flights) {
        return flights.stream()
                .filter(flight -> flight.getSegments().stream().noneMatch(segment -> segment.getArrival().isBefore(segment.getDeparture())))
                .collect(Collectors.toList());
    }
}
