/**
 * Created by ankur on 17/7/17.
 */
public class PrintOddEven {

    //Question 1
    public static void main(String[] args) {
        System.out.println("in main thread");
        Thread t = new Thread(() -> printEven());
        Thread t2 = new Thread(() -> printOdd());
        t.start();
        t2.start();
        t.setPriority(10);
        t2.setPriority(1);
    }
    public static void printEven(){
        for(int i = 0; i <= 20; i= i+2){
            System.out.println("Even : "+i);
        }
    }
    public static void printOdd(){
        for(int i = 1; i <= 19; i= i+2){
            System.out.println("Odd : "+i);
        }
    }
}
