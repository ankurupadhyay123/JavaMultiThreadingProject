/**
 * Created by ankur on 17/7/17.
 */

//Question 3
public class PrintPattern {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        t1.start();
        t2.start();
        t3.start();
        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(1);
    }
}

class Thread1 extends Thread{

    @Override
    public void run(){
        for(int i=1 ; i<10 ; i++){
            System.out.print("1 ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Thread2 extends Thread {

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.print("2 ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Thread3 extends Thread {

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.print("3 ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
