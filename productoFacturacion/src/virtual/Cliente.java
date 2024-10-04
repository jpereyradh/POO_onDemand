package virtual;

public class Cliente {
    private String nombre;
    private String direccion;

    public Cliente(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void comprar(Producto producto) {
        System.out.println(nombre + " ha comprado el producto: " + producto.getNombre() + " por $" + producto.getPrecio());
        Facturacion facturacion = new Facturacion(this, producto);
        facturacion.facturar();
    }

}
