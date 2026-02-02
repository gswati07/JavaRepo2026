import java.util.Scanner;

public class StringOperations {
    // reverse the string
    public static String reverseString(String str){
        String reverse ="";
        for(int i=str.length()-1;i>=0;i--){
           reverse += str.charAt(i);
        }
        return reverse ;
    }
    // Using StringBuilder's reverse method
    String reversed = new StringBuilder(str).reverse().toString();

    // Using Collections.reverse()
    // Using Arrays.sort() for anagram problems


    // check string is palindrome
    public static boolean isPalindrome(String str){
        String reverse = "";
        for (int i =str.length()-1;i>=0;i--){
            reverse += str.charAt(i);
        }
        return reverse.equals(str);

    }
    //Count occurrence of each character in string
    public static void oocurenceCharacter(String str){


    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the string value : ");
        String str=sc.nextLine();
        str=str.toLowerCase();

        String result = reverseString(str);
        System.out.println("the reverse array is : " + result );

        String palindrome = isPalindrome(str) ? "is palindrome" : "not palindrome";
        System.out.println(palindrome);
    }
}
