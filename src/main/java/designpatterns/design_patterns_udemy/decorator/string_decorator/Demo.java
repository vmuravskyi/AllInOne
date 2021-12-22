package designpatterns.design_patterns_udemy.decorator.string_decorator;

public class Demo {

    public static void main(String[] args) {

        MagicString magicString = new MagicString("hello");
        System.out.println(
                magicString + " has " + magicString.getNumberOfVowels() + " vowels");

    }

}
