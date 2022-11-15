public class LargestNumberDemo {
    public static void main(String[] args) {
        int a = 56022, b = 287, c = 2305;

//        if (a > b && a>c)                                // Using AND Operator.
//        {
//         System.out.println( a +": A is Largest");
//        }
//        else if(b>a && b>c){
//            System.out.println( b +": B is Largest");
//        }
//        else{
//            System.out.println( c +": C is Largest");
//        }

                                                          // Without using nested if

//        if(a>b){
//            if(a>c){
//                System.out.println( a +"- A is Greater");
//            }
//            else{
//                System.out.println( c +"- C is Greater");
//            }
//        }
//            else if(b>c){
//                System.out.println( b +"- B is Greater");
//            }
//            else{
//            System.out.println( c +"- C is Greater");
//        }

                                                          // Using Ternary Operator
       int Large = (a>b)?a:b;
            int Largest = (Large>c)?Large:c;
        System.out.println(  Largest +" is Largest");

    }
}