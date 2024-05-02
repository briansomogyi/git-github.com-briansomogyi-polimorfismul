package GhiseulDeIncasari;

public class Adresa {
    String strada;
    int nr;

    public Adresa(String strada, int nr) {
        this.strada = strada;
        this.nr = nr;
    }

    public String getStrada() {
        return strada;
    }

    public void setStrada(String strada) {
        this.strada = strada;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    @Override
    public String toString() {
        return "Adresa [strada=" + strada + ", nr=" + nr + "]";
    }

}
