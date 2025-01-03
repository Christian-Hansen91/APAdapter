package opg1;

public class Elvare extends Vare{
    public Elvare(int pris, String navn) {
        super(pris, navn);
    }

    @Override
    public double beregnMoms() {
        double moms = getPris() * 0.3;
        return moms > 3.0 ? moms : 3.0;
    }
}
