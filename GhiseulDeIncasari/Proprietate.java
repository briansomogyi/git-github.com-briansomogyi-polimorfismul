package GhiseulDeIncasari;

public abstract class Proprietate {
    private Adresa adresa;
    private int suprafata;
    private double cost;

    public Proprietate(Adresa adresa, int suprafata) {
        this.adresa = adresa;
        this.suprafata = suprafata;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }

    public int getSuprafata() {
        return suprafata;
    }

    public void setSuprafata(int suprafata) {
        this.suprafata = suprafata;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public abstract double calculeazaCost();

    @Override
    public String toString() {
        return "Proprietate [adresa=" + adresa + ", suprafata=" + suprafata + ", cost=" + cost + "]";
    }

}
