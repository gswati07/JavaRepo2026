import java.util.Scanner;

public class RevereseArray {
    public static void reversearr(int[] arr){
        for(int i=arr.length-1 ;i >=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array length : ");
        int length =sc.nextInt();
        if (length ==0){
            System.out.println("Invalid length");
            return ;
        }
        System.out.println("Enter array elements : ");
        int[] arr=new int[length];
        for(int i=0;i<length;i++){
            arr[i] =sc.nextInt();
        }
        reversearr(arr);

    }
}
