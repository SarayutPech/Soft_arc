package behavioral1;

import java.util.ArrayList;

// ตอนแรก import ตาม lib แล้วเราไม่สามารถกำหนด type ของ Parameter ที่จะใช้ได้จึงขอเปลี่ยนมา implements interface ที่สร้างเอง
public class NewsPublisher implements Publisher{
    private ArrayList<NewsReader> newsSubscriberList = new ArrayList<>();

    @Override
    public void subscribe(NewsReader subscriber) {
        this.newsSubscriberList.add( subscriber );
    }

    public void publish(News news){
        for( NewsReader newsSubscriber : newsSubscriberList){
            newsSubscriber.update( news.getContent() );
        }
    }


}
