import java.util.Arrays;

public class ArrayOperations{
    //Insert operations
    public static int[] InsertAtBiginning(int[] arr, int value){
        int[] newarr=new int[arr.length + 1];
        newarr[0] =value;
        for(int i=0;i<arr.length;i++){
             newarr[i+1] = arr[i];
        }
       return newarr;
    }
    public static int[] InsertATEnd(int[] arr1, int value){
        int[] newarr = new int[arr1.length+1];

        for(int i=0;i< arr1.length;i++){
            newarr[i] = arr1[i];
        }
        newarr[arr1.length] = value;
        return newarr;
    }

    public static int[] insertAtposition(int[] arr,int value,int position){
        int[] newarr =new int[arr.length+1];

        for(int i=0;i<position;i++){
            newarr[i] =arr[i];
        }
        newarr[position] =value ;
        for(int i=position ;i < arr.length;i++){
            newarr[i+1] = arr[i];

        }
        return newarr;
    }
    //Delete Operation
    public static int[] DeleteAtStart(int[] arr) {
        int[] newarr=new int[arr.length-1];
        for(int i=1;i<arr.length;i++){
            newarr[i-1] =arr[i];
        }
        return newarr;

    }
    public static int[] DeleteAtEnd(int[] arr){
        int[] newarr=new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            newarr[i] =arr[i];
        }
        return newarr;

    }
    public static int[] DeleteAtPosition(int[] arr,int position){
        int[] newarr =new int[arr.length-1];
        for(int i=0;i<position;i++){
            newarr[i] =arr[i];
        }
        for(int i=position;i<arr.length-1;i++){
            newarr[i]=arr[i+1];
        }
        return newarr;
    }

    public static void main(String[] args){
        int arr[] = {12,13,15,16,12,52};
        int arr1[] ={11,12,14,16};
        arr=DeleteAtPosition(arr,3);
        System.out.println(Arrays.toString(arr));
    }
}
