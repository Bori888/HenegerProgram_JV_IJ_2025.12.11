public class LyukasHemger extends MertaniHenger {
    private  double falvastagsag;

    public LyukasHemger(double sugar,double magassag,double falvastagsag) {
        this(sugar,magassag,1,falvastagsag);
    }

    public LyukasHemger(double sugar,double magassag,double fajsuly,double falvastagsag) {
        super(sugar,magassag,fajsuly);
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
