package Chapter10;

import java.util.SplittableRandom;

public class GenericsDemo7 {
    public static void main(String[] args) {
        Info<String> i1 = new Info<>();
        Info<String> i2 = new Info<>();
        i1.setInfo("王义喆");
        i2.setInfo("王天佑");
        add(i1,i2);
    }
    public static <T> void add(Info<T> i1,Info<T> i2){
        System.out.println(i1.getInfo()+""+i2.getInfo());//""防止报错
    }


}
