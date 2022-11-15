import java.util.Arrays;

public class ArrayDuplicate {
    public static void main(String[] ar){
        int[] a = { 9,5,3,6,8};
        boolean check = false;
        for(int i =0;i<a.length ; i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.println("Duplicate Found");
                    check = true;
                }
            }
        }
        if(check==false){
            System.out.println("No Duplicate");
        }
    }
}
