package structural;
import java.util.ArrayList;

public class HealthcareWorkerTeam implements HealthcareServiceable{
    private ArrayList<HealthcareServiceable> members =new ArrayList<HealthcareServiceable>();

    public void addMember(HealthcareServiceable name){
        members.add(name);
    }

    public void removeMember(HealthcareServiceable name){
        members.remove(name);
    }
    @Override
    public void service() {
        members.forEach((i) -> i.service());
    }

    @Override
    public double getPrice() {
        double price = 0;
        for (HealthcareServiceable i : members) {
            price += i.getPrice();
        }
        return price;
    }


}
