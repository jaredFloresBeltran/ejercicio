package Demo;

public class UsuarioSeguro {
    private String nombreUsuario;
    private String password;

    public void setNombreUsuario(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombreUsuario = nombre;
        } else {
            System.out.println("El nombre no puede estar vacío");
        }
    }

    public void setPassword(String pass) {
        boolean tieneMayus = false;
        boolean tieneMinus = false;
        boolean tieneNumero = false;

        if (pass.length() < 8) {
            System.out.println("La contraseña debe tener 8 o más caracteres");
            return;
        }

        for (int i = 0; i < pass.length(); i++) {
            char c = pass.charAt(i);

            if (Character.isUpperCase(c)) {
                tieneMayus = true;
            }
            if (Character.isLowerCase(c)) {
                tieneMinus = true;
            }
            if (Character.isDigit(c)) {
                tieneNumero = true;
            }
        }

        if (!tieneMayus) {
            System.out.println("Falta una mayuscula");
            return;
        }
        if (!tieneMinus) {
            System.out.println("Falta una minuscula");
            return;
        }
        if (!tieneNumero) {
            System.out.println("Falta un numero");
            return;
        }

        this.password = pass;
        System.out.println("Contraseña valida!");
    }

    public boolean autenticar(String passIntentado) {
        if(passIntentado.equals(password)){
            return true;
        }
        else{
            return false;
        }
    }
}



