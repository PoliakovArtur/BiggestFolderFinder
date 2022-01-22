import com.skillbox.airport.Aircraft;
import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import com.skillbox.airport.Terminal;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


    }

    public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {
        List<Flight> flights = new ArrayList<>();

        airport.getTerminals().forEach(terminal -> flights.addAll(terminal.getFlights()));

        return flights.stream().filter(f -> {
            if (f.getType().equals(Flight.Type.ARRIVAL)) {
                return false;
            }
            boolean isBeforeTwoHours = f.getDate().getTime() <= System.currentTimeMillis() + 7200_000;
            boolean isAfterCurrentMoment = f.getDate().getTime() >= System.currentTimeMillis();
            return (isBeforeTwoHours) && (isAfterCurrentMoment);
        }).toList();
    }
}