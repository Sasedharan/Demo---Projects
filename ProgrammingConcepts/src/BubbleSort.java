import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[4];
        System.out.println("Enter the 4 - Elements in to be sorted");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1; j++) {
                if (a[j] > a[j + 1])
                {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("The Sorted Order is : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
    }
}