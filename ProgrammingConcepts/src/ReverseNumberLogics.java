import java.util.Scanner;

public class ReverseNumberLogics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = sc.nextInt();

        while (number != 0) {                   /* Why the result not print in stringbuffer type while
                                                   executing along with while loop. */
            int a = number % 10;
            System.out.print(a);
            number = number / 10;
        }

       // 2.StringBuffer and 3. StringBuilder class

        StringBuffer sb = new StringBuffer(String.valueOf(number)); // valueof method used to convert number into string.
       // StringBuffer sb = new StringBuffer("Sethapayaleee");      // can Send String directly as input.
        StringBuffer result = sb.reverse();
        System.out.println("The reversing number using StringBuffer :" + result);

    }
}
