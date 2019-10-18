package threads;
public class Threads {
    public static void main(String[] args) {
        Customer Carlos = new Customer("Carlos", 5);
        Customer Lirey = new Customer("Lirey", 3);
        Customer Omar = new Customer("Omar", 10);
        
        Seller Francisco = new Seller("Francisco", "Hombre", Carlos);
        Seller Daniela = new Seller("Daniela", "Mujer", Lirey);
        Seller Brenda = new Seller("Brenda", "Mujer", Omar);
        
        Francisco.start();
        Daniela.start();
        Brenda.start();
    }    
}