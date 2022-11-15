import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class RandomNoString {
    public static void main(String[] args){
        Random rd = new Random();
        System.out.println( rd.nextInt(50));
        System.out.println(Math.random());

        String s = RandomStringUtils.random(10);

        String s1 = RandomStringUtils.randomAlphabetic(3);
       String s2 = RandomStringUtils.randomNumeric(4);
        System.out.println(s);

    }
}
