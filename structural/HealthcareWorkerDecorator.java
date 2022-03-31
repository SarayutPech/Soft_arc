package structural;

public abstract class HealthcareWorkerDecorator extends HealthcareWorker{
    private HealthcareWorker worker = null;

    public HealthcareWorkerDecorator(HealthcareWorker name){
        super(name);
        worker = name;
    }

    @Override
    public void service() {
        worker.service();
    }

    @Override
    public double getPrice() {
        return worker.getPrice();
    }
}
