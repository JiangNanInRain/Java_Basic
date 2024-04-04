package Chapter15;
class X{

}
public class GetClassDemo1 {
    public static void main(String[] args) {
        Class<?> c1 = null;
        Class<?> c2 = null;
        Class<?> c3 = null;
        try {
            c1 = Class.forName("Chapter15.X");
        }catch (Exception e){

        }
        c2 = new X().getClass();
        c3 = X.class;
        System.out.println(c1.getName());
        System.out.println(c2.getName());
        System.out.println(c3.getName());

    }
}
