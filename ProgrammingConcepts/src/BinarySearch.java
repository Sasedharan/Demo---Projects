import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements in Array");
        int input = sc.nextInt();
        int[] a = new int[input];
        System.out.println("Enter the Elements in Ascending Order");
        for (int i = 0; i < input; i++)
        {
            a[i] = sc.nextInt();
        }
        boolean check = false;
        System.out.println("---Finding the Element By BINARY Search ---");
        System.out.println("Enter the Search Element");
        int element = sc.nextInt();
        int first = 0,last = a.length-1,mid;
        while(first<=last){
            mid = first + last /2;
            if(a[mid]==element){
                System.out.println("The Element found in "+mid+"th position");
                check = true;
                break;
            }
            if(element<a[mid]){
                last = mid -1;
            }
            if(element>a[mid]){
                first = mid+1;
            }
        }
        if(check ==false){
            System.out.println("Element not found");
        }
    }

}