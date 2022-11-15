public class PrimeNumber {
    public static void main(String[] ar){
        int number = 92;
        if(number==0 || number ==1)
        {
            System.out.println("Not an Prime number");
        }
        for( int i = 2;i<number;i++){
            if(number%i==0){
                System.out.println("Not an Prime Number");
                break;
            }
            else {
                System.out.println("Prime Number");
                break;
            }
        }

    }
}
