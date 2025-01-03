package opg3;

import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Team basketball = new Team("basketball", Weekday.TIRSDAG);
        Team volley = new Team("volley", Weekday.TIRSDAG);
        Team fodbold = new Team("fodbold", Weekday.TORSDAG);
        Team haandbold = new Team("håndbold", Weekday.TORSDAG);

        Sekvens<Team> sek1 = new ListSekvens<>(List.of(basketball, volley, fodbold, haandbold));

        Team basketball2 = new Team("basket", Weekday.TIRSDAG);
        Team floorball2 = new Team("floorball", Weekday.ONSDAG);
        Team fodbold2 = new Team("fodbold", Weekday.TORSDAG);

        Sekvens<Team> sek2 = new ListSekvens<>(List.of(basketball2, floorball2, fodbold2));

        Iterator<Team> sek1iter = sek1.iterator();
        while (sek1iter.hasNext()) System.out.println(sek1iter.next());

        Iterator<Team> sek2iter = sek2.iterator();
        while(sek2iter.hasNext()) System.out.println(sek2iter.next());

    }
}
