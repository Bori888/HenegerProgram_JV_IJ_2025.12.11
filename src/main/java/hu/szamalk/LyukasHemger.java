package hu.szamalk;

public class LyukasHemger {
    private  double falvastagsag;

    public LyukasHemger(double falvastagsag) {
        this.falvastagsag = falvastagsag;
    }

    public double getFalvastagsag() {
        return falvastagsag;
    }
    public  double terfogat(){

        return 0;
    }

    @Override
    public String toString() {
        return "Cso{" +
                "falvastagsag=" + falvastagsag +
                '}';
    }
}
