package abstractclasses;

public class Engineer extends Worker{

    public Engineer(int id_worker, String name, String job, int age, int labor_old) {
        super(id_worker, name, job, age, labor_old);
    }

    @Override
    protected void work() {
        System.out.println("Trabajo diseñando robots");
    }

    @Override
    protected void specialize() {
        System.out.println("Me especializaré en inteligencia artificial");
    }
    
}