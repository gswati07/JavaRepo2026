import java.util.Scanner;

public class LargestNumArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int length =sc.nextInt();
        if (length ==0){
            System.out.println("Invalid length");
            return ;
        }
        int[] arr=new int[length];
        for(int i=0;i<length;i++){
            arr[i] =sc.nextInt();
        }
        int large = arr[0];
        for(int i=1;i<arr.length;i++){

            if(arr[i] > large){
                large =arr[i];
            }
        }
        System.out.println("the largest number in an array is : " + large);}


}
