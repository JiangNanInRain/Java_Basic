package Chapter10;


class InfoWYZ <T extends Number>{//如果设置下限，则为<T super String>,方法可以用通配符<? super String>
    private T info;

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "InfoWYZ{" +
                "info=" + info +
                '}';
    }
}

public class GenericsDemo4 {
    public static void main(String[] args) {
        //InfoWYZ<String> i1 =new InfoWYZ<>();错误案例，String不符合泛型约束的范围
        InfoWYZ<Integer> i2 =new InfoWYZ<>();
        //System.out.println(i1);
        System.out.println(i2);



    }

}
