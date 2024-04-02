package Chapter11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {
    public static void main(String[] args) {
        String  str = "A1B22C333D444E555F";
        String pat = "\\d+";
        Pattern p = Pattern.compile(pat);
        Matcher m  = p.matcher(str);
        String newString = m.replaceAll("__");
        System.out.println(newString);


    }
}
