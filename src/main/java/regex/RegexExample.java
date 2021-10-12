package regex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        String str = "\"1000.00\n" +
                "125 Market 125.45\n" +
                "126 Hardware 34.95\n" +
                "127 Video 7.45\n" +
                "128 Book 14.32\n" +
                "129 Gasoline 16.10\"";

        String pattern = "\\b\\d{1,4}[,.']\\d{1,3}";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);

        List<Double> prices = new ArrayList<>();
        while (m.find()) {
            prices.addAll(Collections.singleton(Double.valueOf(str.substring(m.start(), m.end()))));
        }
        System.out.println(prices);



//        String patter = "\\w+(\\.\\w+)*@(\\w+\\.+)+\\w{2,}";
//        String text = "v.muravskyi@gmail.com";
//        //
//        Pattern p = Pattern.compile(patter);
//        Matcher m = p.matcher(text);
//
//        if (m.matches()) {
//            System.out.println("Email matches the pattern");
//        }
//        while (m.find()) {
//            System.out.print(text
//                    .substring(m.start(), m.end()) + "*");
//        }


//        String str = "\tTabulated String\t";
//        System.out.println(str);
//
//        String str1 = "Vova";
//        StringBuilder sb = new StringBuilder(str1);
//
//        int i = sb.indexOf("Vo");
//        sb.insert(i, "Vova");
//        System.out.println(sb.toString());


    }
}

