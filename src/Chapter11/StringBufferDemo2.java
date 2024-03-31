package Chapter11;

public class StringBufferDemo2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        fun(sb);
        System.out.println(sb);
        sb.insert(sb.length(),"赵甜宇");
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb.replace(0,3,"吉"));//[start,end)左闭右开
        System.out.println(sb.substring(0,3));//同上
        System.out.println(sb.delete(0,3));
        System.out.println(sb.indexOf("王",0));

    }
    public  static  void fun(StringBuffer sb){
        sb.append("王义喆");
    }
}
