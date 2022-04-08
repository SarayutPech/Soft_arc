package behavioral1;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class NewsReader implements Subscriber<News> {
    // You need to implement this class
    private String name ;
    public NewsReader(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void onSubscribe(Subscription subscription) {
        // not used
    }

    @Override
    public void onNext(News item) {
        // not used
    }

    @Override
    public void onError(Throwable throwable) {
        // not used
    }

    @Override
    public void onComplete() {
        System.out.println(getName() + "is now Subscriber.");
    }
    public void update(String news){
        System.out.println( getName() +" : news is updata -> " + news );
    }

}
