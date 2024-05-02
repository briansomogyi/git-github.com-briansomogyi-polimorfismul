package GhiseulDeIncasari;

public class Cladire extends Proprietate {

    public Cladire(Adresa adresa, int suprafata) {
        super(adresa, suprafata);
    }

    @Override
    public double calculeazaCost() {
        return 500 * this.getSuprafata();
    }

    @Override
    public String toString() {
        return "Cladire []";
    }

}
