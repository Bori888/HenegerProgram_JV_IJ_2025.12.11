package hu.szamalk;

public class TomorHenger {
    private double fajsuj;

    public TomorHenger(double fajsuj) {
        this.fajsuj = fajsuj;
    }

    public double getFajsuj() {
        return fajsuj;
    }
    private double suly(){

        return 0;
    }

    @Override
    public String toString() {
        return "TomorHenger{" +
                "fajsuj=" + fajsuj +
                '}';
    }
}
