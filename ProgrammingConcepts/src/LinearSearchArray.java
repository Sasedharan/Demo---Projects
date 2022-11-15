import java.util.Scanner;

public class LinearSearchArray {
    public static void main(String[] ar){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of elements in Array");
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the Elements one by one");
        for(int i=0;i<n;i++){
             a[i]= scanner.nextInt();
        }
         boolean check = false;
        System.out.println("*** Finding the Element By Linear Search ***");
        System.out.println("Enter the Search Element");
        int search = scanner.nextInt();
        for(int i=0;i<a.length;i++){
            if(a[i]==search){
                System.out.println(" Element found in "+i+"th position");
                check = true;
                break;           // to reduce the iteration process
            }
        }
        if(check==false){
            System.out.println("No Element Found");
        }
    }
}
