package Chapter11;

import java.text.NumberFormat;

public class NumberFormatDemo1 {
    public static void main(String[] args) {
        NumberFormat f = NumberFormat.getInstance();
        System.out.println(f.format(1000000));
        System.out.println(f.format(1000.324));
    }
}
