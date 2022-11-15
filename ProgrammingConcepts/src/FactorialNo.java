public class FactorialNo {
    public static void main(String[] arg){
        int number = 5;
        int fact = 1;
        for(int i = 1;i<=number;i++){
           fact = fact * i;
        }
        System.out.println("The Factorial is :"+fact);
    }
}
