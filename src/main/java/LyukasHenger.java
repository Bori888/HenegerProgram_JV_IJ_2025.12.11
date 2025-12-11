public class LyukasHenger extends MertaniHenger {
    private double falvastagsag;

    public LyukasHenger(double sugar, double magassag, double falvastagsag) {
        this(sugar, magassag, 1, falvastagsag);
    }

    public LyukasHenger(double sugar, double magassag, double fajsuly, double falvastagsag) {
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
        return "LyukasHenger{" +
                "sugar=" + getSugar() +
                ", magassag=" + getMagassag() +
                ", falvastagsag=" + falvastagsag +
                ", terfogat=" + terfogat() +
                '}';
    }

}
