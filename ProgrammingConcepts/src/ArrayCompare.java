public class ArrayCompare {
    public static void main(String[] arg) {
        int[] a = {7, 8, 9, 4, 5, 6};
        int[] b = {7, 8, 9, 4, 5, 6};
        boolean value = true;


        if (a.length == b.length)
        {
            for(int i=0;i< a.length;i++)
            {
                if(a[i]!=b[i])
                {
                    value = false;
                }
            }
        }
        else
        {
            value = false;
        }
        if(value==true)
        {
         System.out.println("Array Equal");
        }
        else{
            System.out.println(" not Equal");
        }
    }
}
