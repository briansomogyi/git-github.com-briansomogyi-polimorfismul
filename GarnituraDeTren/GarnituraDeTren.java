package GarnituraDeTren;

import java.util.ArrayList;

public class GarnituraDeTren {
    public static void main(String[] args) {
        ArrayList<Vagon> lVagons = new ArrayList<>();
        lVagons.add(new CalatoriA(40, 300));
        lVagons.add(new CalatoriB(50, 400));
        lVagons.add(new Marfa(400));
        Tren tren = new Tren(lVagons);
        Tren tren2 = new Tren(lVagons);
        System.out.println(tren.equals(tren2));
        ArrayList<Tren> lTrens = new ArrayList<>();
        lTrens.add(tren);
        lTrens.add(tren2);
        for (Tren tren3 : lTrens) {
            tren3.afiseazaVagoane();
        }
    }

}
