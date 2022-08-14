package StringDemo;

import java.util.Locale;

public class Demo {
    public static void main(String[] args) {
        //声明一个变量
        String s1 = "Hello";
        int i = s1.length();
        System.out.println(i);
        String s = s1.toUpperCase(Locale.ROOT);

        System.out.println(s);

        boolean b = s.equals("HELLO");
        System.out.println(s1 == s);
        System.out.println(b);
    }
}
