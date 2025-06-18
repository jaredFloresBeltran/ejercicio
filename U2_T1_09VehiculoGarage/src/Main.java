//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage (4);
        Coche coche1 = new Coche ("1111","nissan",4);
        Motocicleta motocicleta1 = new Motocicleta("2222","italika",true);
        Coche coche2 = new Coche ("3333","ford",4);
        Motocicleta motocicleta2 = new Motocicleta("4444","bukati",false);

        garage.estacionar(coche1);
        garage.estacionar(motocicleta1);
        garage.estacionar(coche2);
        garage.estacionar(motocicleta2);
        System.out.println("El numero de vehiculos es:"+garage.contarVehiculos());
        garage.retirar(coche2.getPlaca());
        System.out.println("El nuevo numero de vehiculos es de:"+garage.contarVehiculos());


    }



    }