package Chapter11;

public class RegexDemo3 { //用这个，别用前几个Demo，过于繁琐
    public static void main(String[] args) {
        String  str = "A1B22C333D444E555F".replaceAll("\\d+","王义喆");//把所有的连续数字替换成"_"
        boolean temp = "2024-04-02".matches("\\d{4}-\\d{2}-\\d{2}");
        String[] s = "A1B22C333D444E555F".split("\\d+");
        System.out.println("字符串替换:"+str);
        System.out.println("字符串匹配验证:"+temp);
        System.out.println("字符串分割:");
        for (String ss:s){
            System.out.print(ss+"  ");
        }

    }
}
