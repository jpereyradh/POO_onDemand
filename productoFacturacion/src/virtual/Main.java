package virtual;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Laptop", 1200.0);
        Cliente cliente1 = new Cliente("Juan", "Calle 123");

        cliente1.comprar(producto1);
    }

}
