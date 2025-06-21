public class Main {
    public static void main(String[] args) {
        Inventario inventarios = new Inventario(3);

        Producto producto1 = new Producto("art1\n","Pantalon",06);
        Producto producto2 = new Producto("art2\n","Camisa",04);
        Producto producto3 = new Producto("art3\n","Tenis",01);
        Producto producto4 = new Producto("art4\n","Chamarra",07);

        inventarios.agregarProducto(producto1);
        System.out.println("Total de articulos:" + inventarios.totalItems());

        inventarios.agregarProducto(producto2);
        System.out.println("Total de articulos:" + inventarios.totalItems());

        inventarios.agregarProducto(producto3);
        System.out.println("Total de articulos:" + inventarios.totalItems());

        inventarios.agregarProducto(producto4);
        System.out.println("Total de articulos:" + inventarios.totalItems());

        System.out.println(inventarios.buscar("art1"));
        System.out.println("Total de articulos:" + inventarios.totalItems());
        System.out.println(inventarios.buscar("art5"));
        System.out.println("Total de articulos:" + inventarios.totalItems());

        inventarios.eliminarProducto("art2");
        System.out.println("Total de articulos:" + inventarios.totalItems());

        inventarios.agregarProducto(producto2);
        System.out.println("Total de articulos:" + inventarios.totalItems());

    }
}