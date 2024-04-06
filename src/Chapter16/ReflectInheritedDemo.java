package Chapter16;

import java.lang.annotation.*;

@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@interface  MyInheritedAnnotation{
    public  String name() default "王义喆";
}

@MyInheritedAnnotation(name = "王义吉")
class  Person{

}
class Student extends Person{}
public class ReflectInheritedDemo{
    public static void main(String[] args)throws Exception {//验证Inherited注解的继承机制
        Class<?> c = Class.forName("Chapter16.Student");
        Annotation[] an = c.getAnnotations();
        for(Annotation a:an){
            System.out.println(a);
        }

        //读取内容
        if(c.isAnnotationPresent(MyInheritedAnnotation.class)){
            Annotation m = c.getAnnotation(MyInheritedAnnotation.class);
            String  na = ((MyInheritedAnnotation) m).name();
            System.out.println(na);
        }
    }
}
