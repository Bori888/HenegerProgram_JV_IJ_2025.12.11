import java.util.ArrayList;
import java.util.List;

public class HengerProgram {
    private List <MertaniHenger>hengerek;

    public static void main(String[] args) {
        new HengerProgram().run();

    }
    public void run(){
        MertaniHenger mh1 =new MertaniHenger(1,1);
        MertaniHenger mh2 =new MertaniHenger(2,2);
        MertaniHenger th1 =new TomorHenger(3,3);
        MertaniHenger th2 =new TomorHenger(3,3,3.5);
        MertaniHenger lh1 =new LyukasHemger(4,4,4);
        MertaniHenger lh2 =new LyukasHemger(5,5,5.5,5.55);
        hengerek.add(mh1);
        hengerek.add(mh2);
        hengerek.add(th1);
        hengerek.add(th2);
        hengerek.add(lh1);
        hengerek.add(lh2);

        int db =MertaniHenger.getHengerDarab();
        System.out.println("Hengerek(%d db\n): "+db);
        for(MertaniHenger henger:hengerek){
            System.out.println(henger);
        }

        System.out.println("hengerek átlagtérfogat: " + atlagTerfogat());
        System.out.println("Lyukas hengerek(csővek) sulya: " + csovekSulya());
        System.out.println("hengerek listája: " + lista());


    }


    public HengerProgram() {

    }
    public double atlagTerfogat() {

        return 0;
    }
    public double csovekSulya() {

        return 0;
    }
    private List<MertaniHenger> lista(){
        return new ArrayList<>();
    }



}
