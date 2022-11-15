public class SwappingLogics {
    public static void main(String[] args) {

        int a = 100;
        int b = 50;
//         a = a+b;
//         b = a-b;
//         a = a-b;

         b = b-a;
         a = b+a;
         b = a-b;

        System.out.println("After Swapping :a is " + a + " and b is " + b);
    }
}