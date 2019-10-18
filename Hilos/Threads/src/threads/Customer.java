package threads;
public class Customer {
    private final String nombre;
    private final int productos;

    public Customer(String nombre, int productos) {
        this.nombre = nombre;
        this.productos = productos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getProductos() {
        return productos;
    }
    
    
}