import java.util.List;

public class HengerProgram {
    private List <MertaniHenger>hengerek;

    public static void main(String[] args) {
        new HengerProgram().run();

    }
    public void run(){
        System.out.println("Hengerek:");
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
        return List.of();
    }



}
