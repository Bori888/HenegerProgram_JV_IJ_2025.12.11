package hu.szamalk;

public class Cso {
    private  double falvastagsag;

    public Cso(double falvastagsag) {
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
