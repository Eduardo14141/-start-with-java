package threads;
public class Seller extends Thread{
    private final String nombre;
    private final String sexo;
    private final Customer customer;

    public Seller(String nombre, String sexo, Customer customer) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.customer = customer;
    }
        
    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }
    
    @Override
    public void run(){
        long miliseconds = System.currentTimeMillis();
        System.out.println(customer.getNombre() + " pase con " + this.nombre);
        for(int i = 0; i < customer.getProductos(); i++){
            System.out.println(customer.getNombre() + ", estamos validando el producto " + i);
            wait(1);
        }
        System.out.println("Siempre es un gusto atenderle " + customer.getNombre() + ". Nos tardamos " 
                + (int) Math.round((System.currentTimeMillis() - miliseconds)/1000) + "segundos");
    }
    
    private void wait(int seconds){
        try{
            Thread.sleep(seconds*1000);
        }catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }
}