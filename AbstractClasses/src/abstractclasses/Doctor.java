package abstractclasses;

public class Doctor extends Worker{

    public Doctor(int id_worker, String name, String job, int age, int labor_old) {
        super(id_worker, name, job, age, labor_old);
    }

    @Override
    protected void work() {
        System.out.println("Yo trabajo en un hospital como cirujano");
    }

    @Override
    protected void specialize() {
        System.out.println("Voy a estudiar un posgrado en la facultad de medicina");
    }
    
}