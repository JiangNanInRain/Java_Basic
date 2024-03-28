package Chapter5;

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


        System.out.println(str1.charAt(3));


        byte[] b = str1.getBytes();
        System.out.println(new String(b));
        System.out.println(b[0]+" "+b[1]+" "+b[2]);
        System.out.println(new String(b,1,3));
        System.out.println("----------------------------------");


        //indexOf查找字符串的下標，如果不存在則返回1
        String str4 = "abcdefgh";
        System.out.println(str4.indexOf("c"));
        System.out.println(str4.indexOf("c",3));//從下標3开始找
        System.out.println(str4.indexOf("cd"));
        System.out.println(str4.indexOf("c",2));

        System.out.println("------------------------");
        // JDK1.5 开始提供contains方法
        String str5 = "www.jninrain.com";
        if(str5.contains("jninrain")){
            System.out.println("str5 包含jninrain字符串");
        }

        System.out.println("------------------------------");

        //trim方法去掉左右空格
        String str6 = "   hello   ";
        System.out.println(str6.trim());
        System.out.println("---------------------------------");

        //substring字符串截取方法
        String str7 = "hello world";
        System.out.println(str7.substring(6));//从下标6开始直到末尾
        System.out.println(str7.substring(2,5));//取下标[2,5]子串
        System.out.println("--------------------------");

        //split根据某个字符串来分割字符串
        String str8 = "hello wolrd";
        String[] s = str8.split(" ");//根据空格分割str8
        for (String ss:s) {
            System.out.println(ss);

        }
        String str9 = "192.168.3.2";
        String[] s2 = str9.split("\\.");
        for(String ss:s2){
            System.out.print(ss+":");
        }
        System.out.println("------------------");

        //大小写转换函数
        System.out.println("hello".toUpperCase());
        System.out.println("HELLo".toLowerCase());
        System.out.println("--------------------------");
        //以某字符串开头或者结尾
        System.out.println("JNInRain".startsWith("JN"));
        System.out.println("JNInRain".endsWith("in"));
        System.out.println("------------------------");

        //比较字符串以及如何不区分大小写比较
        System.out.println("hello".equals("HELLO"));
        System.out.println("hello".equalsIgnoreCase("HELLO"));
        System.out.println("---------------------------");


        //将指定的字符串替换成另一个字符串
        System.out.println("hello".replace("l","q"));




    }

}