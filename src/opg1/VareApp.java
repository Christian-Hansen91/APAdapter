package opg1;

import java.util.ArrayList;
import java.util.List;

public class VareApp {
    public static void main(String[] args) {
        Spiritus bats = new Spiritus(100, "små bats");
        Vare termostat = new Elvare(240, "danfoss");
        Vare banan = new Foedevare(3, "banan");
        Vare spiritusAdapter = new SpiritusAdapter(bats);
        Vare billigEl = new Elvare(4, "banan");

        List<Vare> varer = new ArrayList<>(List.of(termostat, banan, spiritusAdapter, billigEl));
        for (Vare vare : varer) {
            System.out.println(vare.getNavn()+ ": " + vare.getPris() +" kr., heraf "+vare.beregnMoms() + " moms");
        }
    }
}
