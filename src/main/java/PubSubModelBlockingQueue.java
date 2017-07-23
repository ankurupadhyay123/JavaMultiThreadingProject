import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

//Question 8
public class PubSubModelBlockingQueue {

    private BlockingQueue<Integer> queue1 = new ArrayBlockingQueue<Integer>(10);

    static int x = 31;

    public void subscriber() {
        for (int i = 0; i < 5; i++) {
            try {
                int val = queue1.take();
                System.out.println(i + ". element subscribed..." + val);
            } catch (InterruptedException e) {}
        }
    }

    public void publisher() {
        for (int i = 0; i < 5; i++) {
            try {
                queue1.put(x);
                x++;
                System.out.println(i + ". element published..." + x);
            } catch (InterruptedException e) {}
        }
    }

    public static void main(String[] args) {
        PubSubModelBlockingQueue p = new PubSubModelBlockingQueue();
        new Thread(){
            public void run(){p.publisher();}
        }.start();
        new Thread(){
            public void run(){p.subscriber();}
        }.start();
    }

}
