package GarnituraDeTren;

public class CalatoriA extends Calatori {

    public CalatoriA(int nrColete, int nrPasageri) {
        super(nrColete, nrPasageri);
    }

    @Override
    public String afiseazaVagon() {
        return getClass().getName();
    }

    @Override
    public String toString() {
        return "CalatoriA []";
    }

}
