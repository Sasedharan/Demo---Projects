import java.util.Scanner;

public class CheckEvenOrOddDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int a = scanner.nextInt();
        int count = 0;
        while (a > 0) {
            a = a / 10;
            count++;
        }
        if(count%2==0){
            System.out.println("Even Digit Number : " + count);
        }
        else{
            System.out.println("Odd Digit Number : " + count);
        }
    }
}