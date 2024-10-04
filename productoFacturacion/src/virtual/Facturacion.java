package virtual;

public class Facturacion {
    private Cliente cliente;
    private Producto producto;

    public Facturacion(Cliente cliente, Producto producto) {
        this.cliente = cliente;
        this.producto = producto;
    }

    public void facturar() {
        System.out.println("Factura generada para " + cliente.getNombre() + ":");
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Precio: $" + producto.getPrecio());
        // Lógica adicional para generar la factura...
    }
}
