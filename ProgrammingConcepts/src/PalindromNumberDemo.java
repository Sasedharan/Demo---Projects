import java.util.Scanner;

public class PalindromNumberDemo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number to check Palindrome");
        int num = scanner.nextInt();
        int UserValue = num;
        int reverse =0;
        while(num!=0){                     // By using storing the result as single number,
                                  // then only easy to compare to check as palindrome - refer reverse no.problem
            reverse = reverse *10 + num%10;
            num /=10;
        }
        if(UserValue==reverse) {
            System.out.println("The Number is Palindrome : " + reverse);
        }
        else {
            System.out.println("The Number is Not a Palindrome" + reverse);
        }
    }
}
