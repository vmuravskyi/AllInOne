package kata.six;

public class writeNumberInExtendedForm {
    public static void main(String[] args) {
        int test = 12345;
        System.out.println(expandedForm(test));
    }


    private static int countMillions(int num) {
        if (num < 1000000) {
            return 0;
        }
        int millions = 0;
        while (num > 1000000) {
            num -= 1000000;
            millions++;
        }
        return millions;
    }

    private static int countHundredThousands(int num) {
        if (num < 100000) {
            return 0;
        }
        int hundredThousands = 0;
        while (num > 100000) {
            num -= 100000;
            hundredThousands++;
        }
        return hundredThousands;
    }

    private static int tensThousands(int num) {
        if (num < 10000) {
            return 0;
        }
        int tensThousands = 0;
        while (num > 10000) {
            num -= 10000;
            tensThousands++;
        }
        return tensThousands;
    }


    private static int countThousands(int num) {
        if (num < 1000) {
            return 0;
        }
        int thousands = 0;
        while (num > 1000) {
            num -= 1000;
            thousands++;
        }
        return thousands;
    }

    private static int countHundreds(int num) {
        int hundreds = 0;
        while (num > 100) {
            num -= 100;
            hundreds++;
        }
        return hundreds;
    }

    private static int countTens(int num) {
        int tens = 0;
        while (num > 10) {
            num -= 10;
            tens++;
        }
        return tens;
    }

    private static int countCyfras(int num) {
        int cyfra = 0;
        while (num > 0) {
            num -= 1;
            cyfra++;
        }
        return cyfra;
    }

    private static String expandedForm(int num) {
        StringBuilder sb = new StringBuilder();

        if (countMillions(num) * 1000000 > 1) {
            String millions = String.valueOf(countMillions(num) * 1000000);
            sb.append(millions).append(" + ");
            num = num - countMillions(num) * 1000000;
        }

        if (countHundredThousands(num) * 100000 > 1) {
            String hundredThousands = String.valueOf(countHundredThousands(num) * 100000);
            sb.append(hundredThousands).append(" + ");
            num = num - countHundredThousands(num) * 100000;
        }

        if (tensThousands(num) * 10000 > 1) {
            String tensThousands = String.valueOf(tensThousands(num) * 10000);
            sb.append(tensThousands).append(" + ");
            num = num - tensThousands(num) * 10000;
        }


        if (countThousands(num) * 1000 > 1) {
            String thousands = String.valueOf(countThousands(num) * 1000);
            sb.append(thousands).append(" + ");
            num = num - countThousands(num) * 1000;
        }

        if (countHundreds(num) * 100 > 1) {
            String hundreds = String.valueOf(countHundreds(num) * 100);
            sb.append(hundreds).append(" + ");
            num = num - countHundreds(num) * 100;
        }

        if (countTens(num) * 10 > 1) {
            String tens = String.valueOf(countTens(num) * 10);
            sb.append(tens).append(" + ");
            num = num - countTens(num) * 10;
        }

        if (countCyfras(num) > 1) {
            String cyfraStr = String.valueOf(countCyfras(num));
            sb.append(cyfraStr);
        }

        return sb.toString();
    }
}
