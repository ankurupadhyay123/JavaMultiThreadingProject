/**
 * Created by ankur on 18/7/17.
 */
public class CalculateSum {
    //Question 6
    static int arr[] = {98,1,56,34,45,6,72,21,91,100,3,37};
    static int max;

    public static void main(String[] args) {
        System.out.println("in main thread");
        Thread t1 = new Thread(() -> thread1());
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("max-value of array is "+max);
    }
    public static void thread1(){
        Thread t2 = new Thread(() -> thread2());
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i = 9; i<12; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
    }
    public static void thread2(){
        Thread t3 = new Thread(() -> thread3());
        t3.start();
        try {
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i = 6; i<9; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
    }
    public static void thread3(){
        Thread t4 = new Thread(() -> thread4());
        t4.start();
        try {
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i = 3; i< 6; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
    }
    public static void thread4(){
        for(int i = 0; i< 3; i++){
            max = arr[0];
            if(max<arr[i+1]){
                max=arr[i];
            }
        }
    }
}
