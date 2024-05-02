package GhiseulDeIncasari;

import java.util.ArrayList;

public class Fluturas {
    private Contribuabil contribuabil;
    private ArrayList<Proprietate> list;
    private double sumaTotala;

    public Contribuabil getContribuabil() {
        return contribuabil;
    }

    public void setContribuabil(Contribuabil contribuabil) {
        this.contribuabil = contribuabil;
    }

    public ArrayList<Proprietate> getList() {
        return list;
    }

    public void setList(ArrayList<Proprietate> list) {
        this.list = list;
    }

    public double getSumaTotala() {
        return sumaTotala;
    }

    public void setSumaTotala(double sumaTotala) {
        this.sumaTotala = sumaTotala;
    }

    public Fluturas(Contribuabil contribuabil, ArrayList<Proprietate> list) {
        this.contribuabil = contribuabil;
        this.list = list;
    }

    public double calculeazaSumaTotala() {
        double sumaTotala = 0;
        for (Proprietate proprietate : list) {
            sumaTotala += proprietate.calculeazaCost();
        }
        return sumaTotala;
    }

    @Override
    public String toString() {
        return "Fluturas [contribuabil=" + contribuabil + ", list=" + list + ", sumaTotala=" + sumaTotala + "]";
    }

}
