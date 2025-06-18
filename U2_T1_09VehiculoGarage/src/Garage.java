public class Garage{
    private Vehiculo[] Espacios;

    public Garage(int numEspacios) {
        Espacios = new Vehiculo[numEspacios];
    }

    public boolean estacionar(Vehiculo v){
        for (int i = 0; i < Espacios.length; i++){
            if(Espacios[i] == null){
                Espacios[i] = v;
                return true;
            }
        }
        return false;
    }

    public boolean retirar(String placa) {
        for (int i = 0; i < Espacios.length; i++) {
            if (Espacios[i].getPlaca().equals(placa)) {
                Espacios[i] = null;
                return true;
            }
        }
        return false;
    }
        public int contarVehiculos () {
            int contador = 0;
            for (Vehiculo v : Espacios) {
                if (v != null) contador++;
            }
            return contador;

        }


    }