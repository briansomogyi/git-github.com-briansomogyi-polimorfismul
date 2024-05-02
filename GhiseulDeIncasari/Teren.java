package GhiseulDeIncasari;

public class Teren extends Proprietate {
    private int rang;

    public Teren(Adresa adresa, int suprafata, int rang) {
        super(adresa, suprafata);
        this.rang = rang;
    }

    @Override
    public double calculeazaCost() {
        return 350 * getSuprafata() / getRang();
    }

    public int getRang() {
        return rang;
    }

    public void setRang(int rang) {
        this.rang = rang;
    }

    @Override
    public String toString() {
        return "Teren [rang=" + rang + "]";
    }

}
