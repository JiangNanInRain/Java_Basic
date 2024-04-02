package Chapter11;

import java.util.regex.Pattern;

public class RegexDemo1 {
    public static void main(String[] args) {
        String  str = "A1B22C333D444E555F";
        String pat = "\\d+";
        Pattern p = Pattern.compile(pat);
        String[] s = p.split(str);
        for(String ss:s){
            System.out.println(ss);
        }
    }
}
