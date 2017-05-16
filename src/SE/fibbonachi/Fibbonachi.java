package SE.fibbonachi;

/**
 * Created by Garret on 28.03.2017.
 */
public class Fibbonachi {
    public static void main(String[] args) {
        System.out.println("Method fiboIterate:");
        fiboIterate(4);
        System.out.println("\nMethod fiboNumber:");
        fiboNumber(612);
    }
    static void fiboIterate (int numOfIterates){

        int fib1 = 1;
        int fib2 = 1;
        int res;
           if (numOfIterates == 1){
               System.out.println(numOfIterates);
               return;
           } else if (numOfIterates < 1){
               System.out.println("User is INVALID");
           }else{
               System.out.print(fib1 + " " + fib2 + " ");
               for (int i = 0; i < numOfIterates-2; i++) {
                   res = fib1+ fib2;
                   fib1 = fib2;
                   fib2 = res;
                   System.out.print(res + " ");
               }
           }
    }

    static void fiboNumber (int fibNum){
        int fib1 = 1;
        int fib2 = 1;
        int res = 0;
        if (fibNum == 1){
            System.out.println(fibNum);
            return;
        } else if (fibNum < 1){
            System.out.println("User is INVALID");
        }else{
            System.out.print(fib1 + " " + fib2 + " ");
            while(res  < fibNum) {
                res = fib1+ fib2;
                fib1 = fib2;
                fib2 = res;
                if (res <= fibNum)
                    System.out.print(res + " ");
            }
        }
    }
}
