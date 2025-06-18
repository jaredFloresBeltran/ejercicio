public class Main {
    public static void main(String[] args) {
        Empleado emp1 = new EmpleadoTiempoCompleto("95701", "Jared", 3400, "Vacaciones 2 veces al ano");
        Empleado emp2 = new EmpleadoPorHoras("10229", "Jonathan", 50, 40);

        System.out.println("Salario de " + emp1.getNombre() + ": $" + emp1.calcularSalario());
        System.out.println("------------------------------------------------------------------");
        System.out.println("Salario de " + emp2.getNombre() + ": $" + emp2.calcularSalario());
    }
}
