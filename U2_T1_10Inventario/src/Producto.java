public class Producto {

    private String nombre;
    private int cantidad;
    private String codigo;

    public Producto(String nombre, String codigo,int cantidad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        if (nombre!=null && !nombre.isEmpty()){
            this.nombre=nombre;
        }else{
            System.out.println("El nombre no debe de estar vacio");
        }
    }

    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        }else{
            System.out.println("La Cantida no puede ser negativa o estar en cero");
        }
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
        if (codigo != null && codigo.trim().isEmpty() ){
            this.codigo = codigo;
        }else {
            System.out.println("El codigo no puede estar vacio");
        }
    }

}



