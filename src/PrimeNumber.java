import java.util.Scanner;

import static javax.management.Query.or;

public class PrimeNumber {
    public static boolean isPrime(int num){
        if (num<=1){
            return false;
        }
        for(int i=2;i*i <= num;i++){
            if(num % i == 0){
                return false;
            }

        }
        return true;
    }
    public static void CountPrimenum(int first, int last){
        int count=0;
        if (first<0){
            System.out.println("Enter valid number");
            return ;
        }
        for (int i = first; i <= last; i++) {
             boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && i > 1) {
                count++;
            }
        }
        System.out.println("Total prime numbers between " + first + " and " + last + " : " + count);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
          /*System.out.println("Enter the number : ");
        int num=sc.nextInt();
        if(isPrime(num)){
            System.out.println("number is prime");
        }
        else {
            System.out.println("number is not prime");
        } */
        CountPrimenum(1,1000);
    }
}
