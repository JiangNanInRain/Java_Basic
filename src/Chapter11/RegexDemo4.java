package Chapter11;

public class RegexDemo4 {
    public static void main(String[] args) {
        String str = "LXH:98|MLDN:90|LI:100";
        String[] s =  str.split("\\|");
        System.out.println( "拆分之后的结果:");
        for(String ss:s){
            String[] s2 = ss.split(":");
            System.out.println("\t"+s2[0]+"\t"+s2[1]);
        }

    }
}
