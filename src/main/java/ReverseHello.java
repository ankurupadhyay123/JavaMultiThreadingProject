/**
 * Created by ankur on 17/7/17.
 */
public class ReverseHello{
//Question 4
    public static void main(String[] args) {
        System.out.println("Main Thread");
        Thread thread1 = new Thread(() -> createThread1());
        thread1.start();
    }

    public static void createThread1(){
        Thread thread2 = new Thread(() -> createThread2());
        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello from Thread 1");
    }

    public static void createThread2(){
        Thread thread3 = new Thread(() -> createThread3());
        thread3.start();
        try {
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello from Thread 2");
    }

    public static void createThread3(){
        Thread thread4 = new Thread(() -> createThread4());
        thread4.start();
        try {
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello from Thread 3");
    }

    public static void createThread4(){
        Thread thread5 = new Thread(() -> createThread5());
        thread5.start();
        try {
            thread5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello from Thread 4");
    }

    public static void createThread5(){
        Thread thread6 = new Thread(() -> createThread6());
        thread6.start();
        try {
            thread6.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello from Thread 5");
    }

    public static void createThread6(){
        Thread thread7 = new Thread(() -> createThread7());
        thread7.start();
        try {
            thread7.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello from Thread 6");
    }

    public static void createThread7(){
        Thread thread8 = new Thread(() -> createThread8());
        thread8.start();
        try {
            thread8.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello from Thread 7");
    }

    public static void createThread8(){
        Thread thread9 = new Thread(() -> createThread9());
        thread9.start();
        try {
            thread9.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello from Thread 8");
    }

    public static void createThread9(){
        Thread thread10 = new Thread(() -> createThread10());
        thread10.start();
        try {
            thread10.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello from Thread 9");
    }

    public static void createThread10(){
        System.out.println("Hello from Thread 10");
    }
}
