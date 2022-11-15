public class StringMethods {
    public static void main(String[] arg) {
        String s = "asdf ;lkj qwr poiu zxvc mnb";
        String result = s.replaceAll("[0-9a-zA-Z]", "hai");
        System.out.println(result);

        String a = "12365 12356 12387 12398";
        a = a.replaceAll("\\s","-");
        System.out.println(a);

        s.replace("a","s");
        System.out.println(s);

        String  st = "Spring Boot Java";


    }
}
