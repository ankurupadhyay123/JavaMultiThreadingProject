import java.util.LinkedList;
//Quesiton 7
public class PubSubModel {

    final int listSize = 10;
    private LinkedList<Integer> list = new LinkedList<>();

    static int x = 21;

    public void subscriber() {
        for(int i = 0; i < 10; i++){
            synchronized (this) {
                try {
                    while(list.isEmpty()){
                        this.wait();
                    }
                    int val = list.removeFirst();
                    System.out.println("element consumed" + val);
                    this.notify();
                } catch (InterruptedException e) {}
                catch (IndexOutOfBoundsException e){
                }
            }
        }
    }
    public void publisher() {
        for(int i = 0; i < 10; i++){
            synchronized (this) {
                try {
                    while(list.size()==listSize){
                        this.wait();
                    }
                    list.add(x);
                    System.out.println("element published" + x);
                    x++;
                    this.notify();
                } catch (InterruptedException e) {}
            }
        }
    }
    public static void main(String[] args) {
        PubSubModel p = new PubSubModel();
        new Thread(){
            public void run(){p.publisher();}
        }.start();
        new Thread(){
            public void run(){p.subscriber();}
        }.start();
    }
}
