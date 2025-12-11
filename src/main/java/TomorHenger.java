public class TomorHenger extends MertaniHenger {

    private double fajsuly;

    public TomorHenger(double sugar,double magassag,double fajsuly) {
        this(sugar,magassag);
        this.fajsuly=fajsuly;
    }

    public double getFajsuly() {
        return fajsuly;
    }
    private double suly(){

        return 0;
    }

    @Override
    public String toString() {
        return "TomorHenger{" +
                "fajsuly=" + fajsuly +
                '}';
    }
}
