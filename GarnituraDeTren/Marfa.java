package GarnituraDeTren;

public class Marfa extends Vagon {

    public Marfa(int nrColete) {
        super(nrColete);
    }

    @Override
    public String afiseazaVagon() {
        return getClass().getName();
    }

    @Override
    public String toString() {
        return "Marfa []";
    }

}
