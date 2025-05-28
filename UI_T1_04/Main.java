import Model.Computadora;

public class Main {

    public static void main(String[] args){
        Computadora computadora = new Computadora("HUAWEI", "MateBook D15");
        computadora.apagar();
        computadora.encender();
        computadora.apagar();
    }
}
