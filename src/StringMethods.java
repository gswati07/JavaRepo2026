import java.sql.SQLOutput;
import java.util.Scanner;

public class StringMethods {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String testString = "  Welcome to Automation Testing  ";
        String email = "TestUser@Example.COM";
        String url = "https://www.example.com/products/electronics";
        String csv = "John,Doe,30,Engineer,New York";
        String phone = "123-456-7890";
        String password = "Test@123";

        System.out.println("The length of string is : " + password.length());
        System.out.println("the charecter at 10 position is : "+ email.charAt(10));
        System.out.println("The substring of teststring is : "+ testString.substring(3,9));
        System.out.println("the string contains : " + email.contains(".COM"));
        System.out.println("the url starts with : " + url.startsWith("https"));
        System.out.println("The separtion of csv : " + csv.split(",") );
        // replace() & replaceAll()
        System.out.println("the phone number is  : " + phone.replace("-",""));
        String messyText = "Hello    World   Test";
        System.out.println("the messy text is : "+ messyText.replaceAll("Hello","Java"));
        System.out.println("messy test trim function" +messyText.trim());

        // isEmpty() & isBlank()
        String empty = "";
        String blank = "   ";
        String notEmpty = "test";
        System.out.println("   Empty string: '" + empty + "'");
        System.out.println("   isEmpty(): " + empty.isEmpty());
        System.out.println("   isBlank(): " + empty.isBlank());
        System.out.println("   Blank string: '" + blank + "'");
        System.out.println("   isEmpty(): " + blank.isEmpty());
        System.out.println("   isBlank(): " + blank.isBlank());
        System.out.println("   Not empty: '" + notEmpty + "'");
        System.out.println("   isEmpty(): " + notEmpty.isEmpty());


    } }

