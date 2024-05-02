package GarnituraDeTren;

import java.util.ArrayList;

public class Tren {
    private ArrayList<Vagon> lVagons;
    private int nrColete;
    private int nrPasageri;

    public Tren(ArrayList<Vagon> lVagons) {
        this.lVagons = lVagons;
        nrColete = 0;
        for (Vagon vagon : lVagons) {
            int nrColete = vagon.getNrColete();
            this.nrColete += nrColete;
        }
        nrPasageri = 0;
        for (Vagon vagon : lVagons) {
            if (vagon instanceof Calatori) {
                int nrPasageri = ((Calatori) vagon).getNrPasageri();
                this.nrPasageri += nrPasageri;
            }
        }
    }

    public void adaugaVagon(Vagon vagon) {
        lVagons.add(vagon);
    }

    public void adaugaVagoane(ArrayList<Vagon> lVagons) {
        lVagons.addAll(lVagons);
    }

    public void afiseazaVagoane() {
        for (Vagon vagon : lVagons) {
            vagon.afiseazaVagon();
        }
    }

    public int getNrColete() {
        return nrColete;
    }

    public int getNrPasageri() {
        return nrPasageri;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Tren) {
            return this.nrColete == ((Tren) obj).getNrColete();
        } else {
            return false;
        }
    }

    
}
