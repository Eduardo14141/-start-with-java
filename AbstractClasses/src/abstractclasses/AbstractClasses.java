package abstractclasses;
public class AbstractClasses {
    public static void main(String[] args) {
        Doctor doctor = new Doctor(4, "Oscar Martínez", "Doctor", 40, 15);
        doctor.introduceTheirself();
        doctor.specialize();
        doctor.work();
        
        Engineer engineer = new Engineer(2, "Armando Galván", "CEO de mi empresa", 37, 10);
        engineer.introduceTheirself();
        engineer.specialize();
        engineer.work();
    }    
}