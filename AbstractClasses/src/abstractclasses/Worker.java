package abstractclasses;
public abstract class Worker {
    protected int id_worker;
    protected String name;
    protected int age;
    protected String job;
    protected int labor_old;

    public Worker(int id_worker, String name, String job, int age, int labor_old) {
        this.id_worker = id_worker;
        this.name = name;
        this.job = job;
        this.age = age;
        this.labor_old = labor_old;
    }
    
    protected void introduceTheirself(){
        System.out.println("Yo soy " + this.name + ". Tengo " + age
                + " años y trabajo desde hace " + (age - labor_old) + "años");
    }
    protected abstract void work();
    protected abstract void specialize();
}