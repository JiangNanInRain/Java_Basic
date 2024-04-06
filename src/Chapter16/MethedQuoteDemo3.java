package Chapter16;
@FunctionalInterface
interface IMessage3<T>{
    public int compare(T t1,T t2);
}
public class MethedQuoteDemo3 {
    public static void main(String[] args) {
        IMessage3<String> msg = String::compareTo;//引用特定函数
        System.out.println(msg.compare("A","B"));
    }
}
