package Chapter10;


class Demo{
    public  <T> T fun(T t){
        return t;
    }
}
public class GenericsDemo5 {
    public static void main(String[] args) {
        Demo d = new Demo();
        String str = d.fun("王义喆");
        int i = d.fun(2333);
        System.out.println(str);
        System.out.println(i);
    }
}
