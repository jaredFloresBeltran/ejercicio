import java.util.Scanner;

import Peso.Persona;

public class Main{
    public static void main(String[] args) {
        System.out.println("Ingrese el nombre de la persona:");
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la altura de la persona:");
        double altura = scanner.nextDouble();
        System.out.println("Ingrese el peso de la persona:");
        Scanner scanner2 = new Scanner(System.in);
        double peso = scanner2.nextDouble();

        Persona persona = new Persona();
        persona.setNombre(nombre);  
        persona.setAltura(altura);
        persona.setPeso(peso);

        System.out.println(nombre + " tiene un IMC de " + persona.calcularIMC());
        System.out.println("Clasificación: " + persona.clasificarIMC());
    }
}