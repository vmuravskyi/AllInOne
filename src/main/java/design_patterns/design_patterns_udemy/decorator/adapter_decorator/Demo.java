package design_patterns.design_patterns_udemy.decorator.adapter_decorator;


class Demo {

    public static void main(String[] args) {

        MyStringBuilder msb = new MyStringBuilder();
        msb.append("hello").appendLine(" world");
        System.out.println(msb.concat("and this too"));

    }

}
