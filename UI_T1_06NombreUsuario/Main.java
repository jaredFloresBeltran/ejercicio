import Demo.UsuarioSeguro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UsuarioSeguro usuario = new UsuarioSeguro();

        System.out.print("Ingresa tu nombre: ");
        usuario.setNombreUsuario(scanner.nextLine());

        String pass;
        System.out.print("Ingresa tu contraseña: ");
        pass = scanner.nextLine();
        usuario.setPassword(pass);

        System.out.print("Ingresa tu contraseña para entrar: ");
        String intento = scanner.nextLine();

        if (usuario.autenticar(intento)) {
            System.out.println("ACCESO CONCEDIDO");
        } else {
            System.out.println("ACCESO DENEGADO");
        }

        scanner.close();
    }
}