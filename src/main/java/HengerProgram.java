import java.util.ArrayList;
import java.util.List;

public class HengerProgram {
    private List<MertaniHenger> hengerek;

    public static void main(String[] args) {
        new HengerProgram().run();
    }

    public HengerProgram() {
        hengerek = new ArrayList<>();
    }

    public void run() {
        MertaniHenger mh2 = new MertaniHenger(2, 2);
        MertaniHenger th1 = new TomorHenger(3, 3);
        MertaniHenger th2 = new TomorHenger(3, 3, 3.5);
        MertaniHenger lh1 = new LyukasHemger(4, 4, 4);
        MertaniHenger lh2 = new LyukasHemger(5, 5, 5.5, 5.55);

        hengerek.add(new MertaniHenger(1, 1));
        hengerek.add(mh2);
        hengerek.add(th1);
        hengerek.add(th2);
        hengerek.add(lh1);
        hengerek.add(lh2);

        System.out.println("=== Hengerek listája (" + MertaniHenger.getHengerDarab() + " db) ===");
        for (MertaniHenger h : hengerek) {
            String tipus = h.getClass().getSimpleName();
            double terfogat = h.terfogat();
            String extra = "";
            if (h instanceof TomorHenger) {
                extra = String.format(", fajsúly=%.2f, súly=%.2f", ((TomorHenger) h).getFajsuly(), ((TomorHenger) h).terfogat() * ((TomorHenger) h).getFajsuly());
            } else if (h instanceof LyukasHemger) {
                extra = String.format(", falvastagság=%.2f", ((LyukasHemger) h).getFalvastagsag());
            }
            System.out.printf("%-12s | sugár=%.2f, magasság=%.2f, térfogat=%.2f%s%n", tipus, h.getSugar(), h.getMagassag(), terfogat, extra);
        }

        System.out.printf("%nÁtlagos térfogat: %.2f%n", atlagTerfogat());
        System.out.printf("Lyukas hengerek (csövek) összsúlya: %.2f%n", csovekSulya());
    }


    public double atlagTerfogat() {
        if (hengerek.isEmpty()) return 0;
        double ossz = 0;
        for (MertaniHenger h : hengerek) {
            ossz += h.terfogat();
        }
        return ossz / hengerek.size();
    }

    public double csovekSulya() {
        double ossz = 0;
        for (MertaniHenger h : hengerek) {
            if (h instanceof TomorHenger) {
                ossz += ((TomorHenger) h).getFajsuly() > 0 ? ((TomorHenger) h).terfogat() * ((TomorHenger) h).getFajsuly() : 0;
            } else if (h instanceof LyukasHemger) {

            }
        }
        return ossz;
    }

    private List<MertaniHenger> lista() {
        return new ArrayList<>(hengerek);
    }
}
