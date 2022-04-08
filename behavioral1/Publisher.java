package behavioral1;

public interface Publisher {
    abstract void subscribe(NewsReader subscriber);
    abstract void publish(News news);
}
