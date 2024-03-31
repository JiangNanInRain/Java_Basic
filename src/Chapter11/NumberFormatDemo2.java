package Chapter11;

import java.text.DecimalFormat;

class  FormatDemo{
    public  void format(String pattern,double value){
        DecimalFormat df = new DecimalFormat(pattern);
        String str = df.format(value);
        System.out.println(str);
    }
}
public class NumberFormatDemo2 {
    public static void main(String[] args) {
        FormatDemo d = new FormatDemo();
        d.format("000,000,000",1123123123.12);
    }
}
