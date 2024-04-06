package Chapter16;


interface IMessage<P,R>{
    public R zhuanhuan(P p);
}
public class MethodQuoteDemo {
    public static void main(String[] args) {
        IMessage<Integer,String > msg = String::valueOf;//抽象方法引用示范，函数式接口引用了String的valueOf方法进行操作
        System.out.println(msg.zhuanhuan(1000).replaceAll("0","9"));
    }
}
