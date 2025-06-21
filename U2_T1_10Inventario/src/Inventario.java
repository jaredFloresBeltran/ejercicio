class Inventario {
    private Producto[] stock;

    public Inventario(int tamano) {
        stock = new Producto[tamano];
    }

    public boolean agregarProducto(Producto pro) {
        for (int i = 0; i < stock.length; i++) {
            if (this.stock[i] == null) {
                this.stock[i] = pro;
                System.out.println(stock[i].getNombre()+"producto agregado");
                return true;
            }
        }
        return false;
    }

    public boolean eliminarProducto(String codigo) {
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] != null && stock[i].getCodigo().equals(codigo)) {
                System.out.println("producto " + stock[i].getNombre() + " Eliminado");
                this.stock[i] = null;
                return true;
            }
        }
        return false;
    }

    public Producto buscar(String codigo) {
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] != null && stock[i].getCodigo().equals(codigo)) {
                return stock[i];
            }
        }
        return null;
    }

    public int totalItems() {
        int total = 0;
        for (int i=0;i< stock.length;i++){
            if(stock[i]!=null){
                total+=stock[i].getCantidad();
            }
        }
        return total;
    }

}

