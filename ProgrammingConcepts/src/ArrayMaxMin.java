public class ArrayMaxMin {
    public static void main(String[] arg) {
        int[] a = {89, 56, 9, 32, 45, 98, 36};
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("The Min value " + min);
    }
}