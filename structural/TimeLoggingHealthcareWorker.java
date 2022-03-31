package structural;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeLoggingHealthcareWorker extends HealthcareWorkerDecorator{
    public TimeLoggingHealthcareWorker(HealthcareWorker name) {
        super(name);
        System.out.printf("Decorate "+name.getName() + " with TimeLogging.\n");
    }
    public void service(){
        // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy, hh:mm:ss a"); ภาษาเพี้ยนน่าจะเพราะเครื่องผมตั้ง default data ไว้เป็นภาษาไทย
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM HH:mm:ss  yyyy");
        LocalDateTime now = LocalDateTime.now();
        System.out.printf(formatter.format(now) + " : ");
        super.service();
    };
}
