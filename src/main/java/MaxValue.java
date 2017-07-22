/**
 * Created by ankur on 18/7/17.
 */
public class MaxValue  {

    static int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12};
    static int sum;

    public static void main(String[] args) {
        System.out.println("in main thread");

        Thread t1 = new Thread(() -> thread1());
        t1.start();

        System.out.println("sum of array is "+sum);
    }
public static int thread1(){
    Thread t2 = new Thread(() -> thread2());
    t2.start();
    try {
        t2.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    for(int i = 9; i<12; i++){
        sum+=arr[i];
    }
    return sum;
}
        public static int thread2(){
            Thread t3 = new Thread(() -> thread3());
            t3.start();
            try {
                t3.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for(int i = 6; i<9; i++){
                sum+=arr[i];
            }
            return sum;
        }
        public static int thread3(){
            Thread t4 = new Thread(() -> thread4());
            t4.start();
            try {
                t4.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for(int i = 3; i<6; i++){
                sum+=arr[i];
            }
            return sum;
        }
        public static int thread4(){
            for(int i = 0; i<3; i++){
                sum+=arr[i];
            }
            return sum;
        }
}
