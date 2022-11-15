public class ReverseString {
    public static void main(String[] args){
       // 1. concatenation method
        String s = "WELCOME";                  /* why use reverse variable.? */

        for(int i = s.length()-1;i>=0 ;i--){  // if i = s.lenght() --> Exception Error as String Index out of range.
            System.out.print(s.charAt(i));     // rev = rev + s.charAt();
        }
        // 2.using char array by converting string into character
        // 3.using StringBuffer Class
    }

}
