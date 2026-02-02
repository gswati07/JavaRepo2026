public class FibonacciSeries {
    public static void fibonacci(int num){
        int num1=0;
        int num2=1;
        for(int i=0;i<num;i++){
            System.out.println(num1+ " ");
            int num3=num1+num2;
            num1=num2;
            num2=num3;
        }
    }
    public static void main(String[] args)
    {
        fibonacci(10);
    }
}
