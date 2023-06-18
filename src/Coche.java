public class Coche implements Comparable<Coche> {

    private String marca;
    private double kilometros;

    public Coche (String marca, double kilometros) {
        this.marca = marca;
        this.kilometros = kilometros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", kilometros=" + kilometros +
                '}';
    }

    @Override
    public int compareTo(Coche o) {
        return Double.compare(getKilometros(),o.getKilometros());
    }
}
