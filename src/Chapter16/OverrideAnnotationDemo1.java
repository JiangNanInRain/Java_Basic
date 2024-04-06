package Chapter16;

class F{
    public void say(){
        System.out.println("wyz");
    }
}
class S extends F{
    @Override //保证重写方法的时候不容易写错名，只能用于方法
    public void say(){
        System.out.println("zty");
    }
}
public class OverrideAnnotationDemo1 {
    public static void main(String[] args) {

    }
}
