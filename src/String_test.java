public class String_test {
    public static void main(String[] args) {
        String str1 = "hello";
        char[] ch = str1.toCharArray();
        for(char c:ch){
            System.out.print(c+"\t");
        }
        String str2 = new String(ch);
        String str3 = new String(ch,0,3);
        System.out.println(str2);
        System.out.println(str3);
    }

}