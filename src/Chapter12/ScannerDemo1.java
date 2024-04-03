package Chapter12;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        scan.useDelimiter("\n");
        System.out.println("输入:");
        String str = scan.next();
        System.out.println(str);

    }
}
