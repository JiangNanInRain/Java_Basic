package Chapter16;

@FunctionalInterface
interface IMessage2<T>{
    public T upper();
}
public class MethodQuoteDemo2 {
    public static void main(String[] args) {
        //为了引用普通方法，必须通过实例化对象来引用其方法
        IMessage2<String> m = "aBc"::toUpperCase;
        System.out.println(m.upper());


    }
}
