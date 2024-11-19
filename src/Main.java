

import java.util.List;


public class Main {



            public static void main(String[] args) {
                List<Flight> flights =FlightBuilder.createFlights();

                System.out.println("Flight list after filtering by departure time");
                FlightFilter filterByDepartureTime = new FlightFilterByDepartureTime();
                List<Flight> filteredByDepartureTime = filterByDepartureTime.filter(flights);
                filteredByDepartureTime.forEach(flight -> System.out.println(flight.getSegments()));

                System.out.println("\nFlight list after filtering by arrival before departure:");
                FlightFilter filterByArrivalBeforeDeparture = new FlightFilterByArrivalBeforeDeparture();
                List<Flight> filteredByArrival = filterByArrivalBeforeDeparture.filter(filteredByDepartureTime);
                filteredByArrival.forEach(flight -> System.out.println(flight.getSegments()));

                System.out.println("\nFlight list after filtering by total ground time:");
                FlightFilter filterByTotalGroundTime = new FlightFilterByTotalGroundTime();
                List<Flight> filteredByTotalGroundTime = filterByTotalGroundTime.filter(filteredByArrival);
                filteredByTotalGroundTime.forEach(flight -> System.out.println(flight.getSegments()));
            }
        }









