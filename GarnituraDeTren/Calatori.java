package GarnituraDeTren;

public abstract class Calatori extends Vagon {
    private int nrPasageri;

    public Calatori(int nrColete, int nrPasageri) {
        super(nrColete);
        this.nrPasageri = nrPasageri;
    }

    public int getNrPasageri() {
        return nrPasageri;
    }

    public void setNrPasageri(int nrPasageri) {
        this.nrPasageri = nrPasageri;
    }

    @Override
    public abstract String afiseazaVagon();

    public static void deschideUsile() {
        System.out.println("Usile s-au deschis.");
    }

    public static void inchideUsile() {
        System.out.println("Usile s-au inchis.");
    }
}
