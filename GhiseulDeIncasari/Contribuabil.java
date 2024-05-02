package GhiseulDeIncasari;

public class Contribuabil {
    private String nume;
    private String cnp;
    private double dePlatit;

    public Contribuabil(String nume, String cnp) {
        this.nume = nume;
        this.cnp = cnp;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public double getDePlatit() {
        return dePlatit;
    }

    public void setDePlatit(double dePlatit) {
        this.dePlatit = dePlatit;
    }

    @Override
    public String toString() {
        return "Contribuabil [nume=" + nume + ", cnp=" + cnp + ", dePlatit=" + dePlatit + "]";
    }

}
