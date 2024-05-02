package GarnituraDeTren;

public class CalatoriB extends Calatori {

    public CalatoriB(int nrColete, int nrPasageri) {
        super(nrColete, nrPasageri);
    }

    @Override
    public String afiseazaVagon() {
        return getClass().getName();
    }

    @Override
    public String toString() {
        return "CalatoriB []";
    }

    public static void blocheazaGeamurile() {
        System.out.println("Geamurile s-au blocat.");
    }
}
