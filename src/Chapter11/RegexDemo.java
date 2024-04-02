package Chapter11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        String str = "2024-04-02";
        String pat  =  "\\d{4}-\\d{2}-\\d{2}";
        Pattern p = Pattern.compile(pat);
        Matcher m = p.matcher(str);
        if(p.matcher(str).matches()){
            System.out.println("合法");
        }else {
            System.out.println("不合法");
        }
    }
}
