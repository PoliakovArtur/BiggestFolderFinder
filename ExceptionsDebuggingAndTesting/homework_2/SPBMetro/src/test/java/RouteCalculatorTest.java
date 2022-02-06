import core.Line;
import core.Station;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RouteCalculatorTest extends TestCase {
    private StationIndex stationIndex = new StationIndex();
    private RouteCalculator routeCalculator = new RouteCalculator(stationIndex);
    private Line line1 = new Line(1, "Первая");
    private Line line2 = new Line(2, "Вторая");
    private Line line3 = new Line(3, "Третья");

    @Override
    protected void setUp() {

        line1.addStation(new Station("A1", line1));
        line1.addStation(new Station("B1", line1));
        line1.addStation(new Station("C1", line1));
        line1.addStation(new Station("D1", line1));

        line2.addStation(new Station("E2", line2));
        line2.addStation(new Station("F2", line2));
        line2.addStation(new Station("G2", line2));
        line2.addStation(new Station("H2", line2));

        line3.addStation(new Station("J3", line3));
        line3.addStation(new Station("K3", line3));
        line3.addStation(new Station("L3", line3));
        line3.addStation(new Station("M3", line3));

        stationIndex.addLine(line1);
        stationIndex.addLine(line2);
        stationIndex.addLine(line3);

        addStations(line1);
        addStations(line2);
        addStations(line3);

        addConnection(stationIndex.getStation("C1"), stationIndex.getStation("F2"));
        addConnection(stationIndex.getStation("H2"), stationIndex.getStation("L3"));
    }

    public void testCalculateDuration() {
        List<Station> route = new ArrayList<>(line1.getStations().subList(0, 3));
        route.addAll(line2.getStations().subList(1,3));
        double actual = RouteCalculator.calculateDuration(route);
        double expected = 11.0;
        assertEquals(expected, actual);
    }

    public void testGetRouteOnTheLine() {
        List<Station> actual = routeCalculator.getShortestRoute
                (stationIndex.getStation("D1"), stationIndex.getStation("A1"));
        List<Station> expected = line1.getStations();
        Collections.reverse(expected);
        assertEquals(expected, actual);
    }

    public void testGetRouteWithOneConnection() {
        List<Station> actual = routeCalculator.getShortestRoute
                (stationIndex.getStation("A1"), stationIndex.getStation("G2"));
        List<Station> expected = new ArrayList<>(line1.getStations().subList(0, 3));
        expected.addAll(line2.getStations().subList(1, 3));
        assertEquals(expected, actual);
    }

    public void testGetRouteWithTwoConnections() {
        List<Station> actual = routeCalculator.getShortestRoute
                (stationIndex.getStation("B1"), stationIndex.getStation("J3"));
        List<Station> expected = new ArrayList<>(line1.getStations().subList(1, 3));
        expected.addAll(line2.getStations().subList(1, 3));
        expected.add(stationIndex.getStation("H2"));
        expected.add(stationIndex.getStation("L3"));
        expected.add(stationIndex.getStation("K3"));
        expected.add(stationIndex.getStation("J3"));
        assertEquals(expected, actual);
    }

    @Override
    protected void tearDown() {

    }

    private void addStations(Line line) {
        for (Station station : line.getStations()) {
            stationIndex.addStation(station);
        }
    }

    private void addConnection(Station station1, Station station2) {
        ArrayList<Station> connection = new ArrayList<>();
            connection.add(station1);
            connection.add(station2);

        stationIndex.addConnection(connection);
    }

}
