package javafromepam.lecture03;

public class Test {
    public static void main(String[] args) {
        String str = "Java";

        String test = "1F-RUDYARD K1PL1NG";

//        String fixed = correct(test);
        String fixed = test.replaceAll("1", "I").replace("5", "S").replace("0", "O");
        System.out.println(fixed);
    }

    public static String correct(String string) {
        String[] arrOfSymbols = string.split("");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrOfSymbols.length; i++) {
            switch (arrOfSymbols[i]) {
                case "5":
                    arrOfSymbols[i] = "S";
                    sb.append(arrOfSymbols[i]);
                    break;
                case "0":
                    arrOfSymbols[i] = "O";
                    sb.append(arrOfSymbols[i]);
                    break;
                case "1":
                    arrOfSymbols[i] = "I";
                    sb.append(arrOfSymbols[i]);
                    break;
                default:
                    sb.append(arrOfSymbols[i]);
            }
        }
        return sb.toString();
    }
}
