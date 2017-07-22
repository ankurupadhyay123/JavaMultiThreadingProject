/**
 * Created by ankur on 17/7/17.
 */
public class PrintPrimeAndNonPrime {
//Question 2
    public static void main(String[] args) {
        System.out.println("in main thread");
        Thread t = new Thread(() -> printPrime());
        Thread t2 = new Thread(() -> printNonPrime());
        t.start();
        t2.start();
    }

    public static void printPrime(){
    int i,j;
     for (i = 2 ; i <= 20 ;i++){
         for(j = 2 ; j <= i ; j++){
             if(i%j == 0){
                 break;
             }
         }
         if (i == j){
             System.out.println("prime no. is "+i);
         }
     }
    }

    public static void printNonPrime(){
        int i,j;
        for (i = 0 ; i <= 20 ;i++){
            for(j = 2 ; j <= i ; j++){
                if(i%j == 0){
                    break;
                }
            }
            if (i != j){
                System.out.println("Non-prime no. is "+i);
            }
        }
    }
}
