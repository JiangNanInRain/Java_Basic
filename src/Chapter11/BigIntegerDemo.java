package Chapter11;

import java.math.BigInteger;

public class BigIntegerDemo {
    public static void main(String[] args) {
        BigInteger b1 = new BigInteger("1243141421414");
        BigInteger b2 = new BigInteger("9123141421414");
        System.out.println(b1.add(b2));
        System.out.println(b1.subtract(b2));
        System.out.println(b1.multiply(b2));
        System.out.println(b1.divide(b2));
        System.out.println(b1.max(b2));
        System.out.println(b1.min(b2));

        BigInteger res[] = b2.divideAndRemainder(b1);
        System.out.println("商:"+res[0]+"  余数:"+res[1]);
    }
}
