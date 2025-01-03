package opg1;

public class Foedevare extends Vare{
    public Foedevare(int pris, String navn) {
        super(pris, navn);
    }

    @Override
    public double beregnMoms() {
        return getPris() * 0.05;
    }
}
