import java.util.Scanner;

public class SumArray {
    public static void arraySum(int[] arr){
        int sum=0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("The sum of array elements are : "+ sum);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array length : ");
        int length =sc.nextInt();
        if (length <= 0){
            System.out.println("Invalid length");
            return ;
        }
        System.out.println("Enter the array elements : ");
        int[] arr=new int[length];
        for(int i=0;i<length;i++){
            arr[i] =sc.nextInt();
        }
        arraySum(arr);

    }
}
