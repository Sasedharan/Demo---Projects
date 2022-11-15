import java.util.Scanner;

public class NumberOfDigitsDemo {
    public static void main(String[] ar){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Value to find the No of Digits");
        int a = scanner.nextInt();
        int r = 0;
        while(a>0){
            a=a/10;
            r++;
        }
        // Mine - problem in while condition checking.
//        int r=1;
//        while(a/10!=0){
//            r = r+1;
//            a = a/10;
//        }
        System.out.println("The Digit is : " +r);
    }
}
