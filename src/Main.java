import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger number = BigInteger.ONE;
        for (int i = 1; i <= 100; i++) {
            number = number.multiply(BigInteger.valueOf(i));
        }
        char[] chars = (number.toString()).toCharArray();
        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            result = result + Character.getNumericValue(chars[i]);
        }
        System.out.println(result);
    }
}