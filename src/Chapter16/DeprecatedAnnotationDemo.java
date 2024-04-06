package Chapter16;


@Deprecated
class  Demo{
    //表明此方法不适合使用
    @Deprecated
    public String getInfo(){
        return "wyz";
    }
}
public class DeprecatedAnnotationDemo {
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(d.getInfo());
    }
}
