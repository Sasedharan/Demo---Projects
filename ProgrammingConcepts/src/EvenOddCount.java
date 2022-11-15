import java.util.Scanner;

public class EvenOddCount {
    public static void main(String[] ar){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int input = scanner.nextInt();
        int odd = 0, even =0, reminder;
        while(input>0){
            reminder = input % 10;
            if(reminder%2==0)        // reminder/2==0...?
            {
                even++;
            }
            else
            {
                odd++;
            }
            input = input/10;
        }
        System.out.println(" The Number of even digits is " + even);
        System.out.println(" The Number of odd digits is " + odd);

    }
}
