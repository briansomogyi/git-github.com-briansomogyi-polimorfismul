package GarnituraDeTren;

public abstract class Vagon {
    private int nrColete;

    public Vagon(int nrColete) {
        this.nrColete = nrColete;
    }

    public int getNrColete() {
        return nrColete;
    }

    public void setNrColete(int nrColete) {
        this.nrColete = nrColete;
    }

    public abstract String afiseazaVagon();
}
