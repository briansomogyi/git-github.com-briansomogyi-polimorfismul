package GhiseulDeIncasari;

/**
 * Operator
 */
public class Operator {

    private Fluturas fluturas;

    public Operator(Fluturas fluturas) {
        this.fluturas = fluturas;
    }

    public Fluturas getFluturas() {
        return fluturas;
    }

    public void setFluturas(Fluturas fluturas) {
        this.fluturas = fluturas;
    }

    @Override
    public String toString() {
        return "Operator [fluturas=" + fluturas + "]";
    }

}