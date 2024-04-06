package Chapter16;


enum   Myname{ //利用枚举限制注解取值范围
    WYZ,
    ZTY
}

@interface MyDefaultAnnotationEnum{
    public Myname name() default Myname.WYZ;//默认王义喆
    public String[] p()  default {"王义喆"};
}
public class MyAnnotationDemo {
    @MyDefaultAnnotationEnum(name = Myname.WYZ)
    public static void main(String[] args) {

    }
}
