public class MertaniHenger {
    private static int hengerDarab;
    private double sugar, magassag;

    public MertaniHenger(double sugar, double magassag) {
        this.sugar = sugar;
        this.magassag = magassag;
        hengerDarab++;
    }

    public static int getHengerDarab() {
        return hengerDarab;
    }

    public double getSugar() {
        return sugar;
    }

    public double getMagassag() {
        return magassag;
    }

    public double terfogat() {
        return Math.PI * sugar * sugar * magassag;
    }

    @Override
    public String toString() {
        return "Henger{" +
                "sugar=" + sugar +
                ", magassag=" + magassag +
                '}';
    }
}
