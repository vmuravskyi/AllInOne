package epam.qaSummer.Trash;

public class Trash {
    public static void main(String[] args) {
	String str = "vova ";
	var trim = str.trim();
	byte[] mas = str.getBytes();
	byte[] result = new byte[mas.length];
	for (int i = 0; i < mas.length; i++) {
	    result[i] = mas[mas.length - i - 1];
	}
	String reverse = new String(result);
	System.out.println(reverse);
	System.out.println(trim);
    }
}
