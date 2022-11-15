public class AddingNumberdigitsDemo {
    public static void main(String[] args){
        int number = 12;
        int r=0;
         while(number>0)
         {
            int reminder = number%10;
             r = r + reminder;
             number = number/10;
         }
         System.out.println("The Sum of the Digit is :" + r);
    }
}
