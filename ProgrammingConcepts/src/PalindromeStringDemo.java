import java.util.Scanner;

public class PalindromeStringDemo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Word to check Palindrome or not");
        String s = scanner.next();
        String userString = s;
        String reverse = "";                       // reverse variable is necessary to compare - refer stringreverse problem
        for(int i=s.length()-1; i>=0;i--){
            reverse = reverse + s.charAt(i);
        }
        System.out.println(reverse);
        if(userString.equals(reverse)){
            System.out.println("The Word is Palindrome : " + reverse);
        }
        else{
            System.out.println("The Word is not a Palindrome : " + reverse);
        }
    }
}
