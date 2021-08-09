package other;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {

//        String pattern = "\\b\\d{1,3}\\.\\d{2}";
        String pattern = "\\b\\d{1,4}[,.']\\d{1,3}";
        ArrayList<Double> spendings = new ArrayList<>();
        String str = "\"1000.00\n" +
                "125 Market 125.45\n" +
                "126 Hardware 34.95\n" +
                "127 Video 7.45\n" +
                "128 Book 14.32\n" +
                "129 Gasoline 16.10\"";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);

        while (m.find()) {
            System.out.println(str.substring(m.start(), m.end()));
        }

//        while (m.find()) {
//            spendings.add(Double.valueOf(str.substring(m.start(), m.end()).trim()));
//        }
//        m.reset();
//        for (Double d: spendings) {
//            System.out.println(d);
//        }


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

