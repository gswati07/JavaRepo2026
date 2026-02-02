import java.util.Scanner;

public class CountVowel {
    public static void main(String[] args){
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string value : ");
        String str=sc.nextLine();
        int vowelCount=0;
        str=str.toLowerCase();
        // method 1
        for(char ch : str.toCharArray()){
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);
        //method 2
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);
        sc.close();

    }
}
