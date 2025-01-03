package opg1;

public class Spiritus {
    private int prisen;
    private String betegnelse;
    public Spiritus(int prisen, String betegnelse) {
        this.prisen = prisen;
        this.betegnelse = betegnelse;
    }
    public int getPrisen() {
        return prisen;
    }
    public String getBetegnelse() {
        return betegnelse;
    }
    public double hentMoms() {
        return prisen * 0.25;
    }
}