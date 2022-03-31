package structural;

public class TaxPayingHealthcareWorker extends HealthcareWorkerDecorator{
    public TaxPayingHealthcareWorker(HealthcareWorker name) {
        super(name);
        System.out.printf("Decorate "+name.getName()+" with TaxPaying.\n");
    }

    @Override
    public double getPrice() {
        return (super.getPrice() * 0.1) + super.getPrice();
    }
}
