package Chapter10;


class Info<T>{
    private T info;

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }
}


public class GenericsDemo2 {
    public static void main(String[] args) {
        Info<String> i =new Info<>();
        i.setInfo("王义喆");
        fun(i);

    }
    public  static void fun(Info<?> info){
        System.out.println(info.getInfo());
    }
}
