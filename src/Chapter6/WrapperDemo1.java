package Chapter6;

public class WrapperDemo1 {
    public static void main(String[] args) {
        String str1 = "30";
        String str2 = "30.3";
        int x = Integer.parseInt(str1);
        float f = Float.parseFloat(str2);
        System.out.println(x);
        System.out.println(f);
    }
}
