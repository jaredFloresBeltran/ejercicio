public class Coche extends Vehiculo {

    private int numPuertas;

    public Coche(String marca, String placas, int numPuertas) {
        super (marca, placas);
        this.numPuertas = numPuertas;
    }


    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
}
