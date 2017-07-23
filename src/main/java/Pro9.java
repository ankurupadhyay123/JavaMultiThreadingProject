import java.util.Scanner;

/**
 * Created by ankur on 23/7/17.
 */
public class Pro9 {
    public static void main(String[] args) {

        Thread thread1=new Thread(()->print(1));

        thread1.start();

        Thread thread2=new Thread(()->print(2));

        thread2.start();

        Thread thread3=new Thread(()->print(3));

        thread3.start();

        Thread thread4=new Thread(()->print(4));

        thread4.start();
    }

    public static void print(int startNum){

        Thread INSTANCE=Thread.currentThread();

        for (int i = startNum; i <=10 ; i=i+4) {

            System.out.println(INSTANCE.getName()+" : "+i);

        }

    }
}
