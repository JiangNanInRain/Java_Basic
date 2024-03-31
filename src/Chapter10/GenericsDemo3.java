package Chapter10;



public class GenericsDemo3 {
    public static void main(String[] args) {
        Info<Integer> i1 =new Info<>();
        Info<Double> i2 =new Info<>();
        i1.setInfo(123);
        i2.setInfo(123.123);
        fun(i1);
        fun(i2);
    }
    public static void fun(Info<? extends Number> t){
        System.out.println(t.getInfo());

    }
}
