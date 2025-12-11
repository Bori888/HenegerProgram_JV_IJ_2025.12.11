public class LyukasHemger extends MertaniHenger {
    private double falvastagsag;

    public LyukasHemger(double sugar, double magassag, double falvastagsag) {
        this(sugar, magassag, 1, falvastagsag);
    }

    public LyukasHemger(double sugar, double magassag, double fajsuly, double falvastagsag) {
        super(sugar, magassag);
        this.falvastagsag = falvastagsag;
    }

    public double getFalvastagsag() {
        return falvastagsag;
    }

    public double terfogat() {
        double kulso = getSugar();
        double belso = kulso - falvastagsag;
        return Math.PI * getMagassag() * (kulso * kulso - belso * belso);
    }

    @Override
    public String toString() {
        return "Cso{" +
                "falvastagsag=" + falvastagsag +
                '}';
    }
}
