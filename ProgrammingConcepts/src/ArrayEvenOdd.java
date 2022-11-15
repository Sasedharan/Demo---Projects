public class ArrayEvenOdd {
    public static void main(String[] args){
        int[] ar={7,8,6,9,5,4,3};
        System.out.println("Even Numbers");
        for(int i : ar) {
            if (i % 2 == 0) {
                System.out.print(" " + i);
            }
        }
            System.out.println("Odd Numbers");
            for(int i : ar){
                if(i%2!=0){
                    System.out.print(" " +i);
                }
            }
        }
    }

