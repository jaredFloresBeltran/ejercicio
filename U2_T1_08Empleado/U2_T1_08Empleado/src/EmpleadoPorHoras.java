public class EmpleadoPorHoras extends Empleado {

    private int pagoPorHoras;

    public EmpleadoPorHoras(String id, String nombre, double salarioBase, int pagoPorHoras) {
        super(id, nombre, salarioBase);
        this.pagoPorHoras = pagoPorHoras;
    }

    @Override
    public double calcularSalario(){
        return  getSalarioBase()* pagoPorHoras();
    }

    private int pagoPorHoras() {
        return  pagoPorHoras;
    }

    public int getPagoPorHoras() {
        return pagoPorHoras;
    }

    public void setPagoPorHoras(int pagoPorHoras) {
        this.pagoPorHoras = pagoPorHoras;
    }


}
