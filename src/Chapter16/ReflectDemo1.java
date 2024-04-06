package Chapter16;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ReflectDemo1 {
    public static void main(String[] args) throws  Exception{

        Class<?> c = Class.forName("Chapter16.SimpleBeanOne");
        Method met  = c.getMethod("toString");
        Annotation[] an =  met.getAnnotations();
        for(Annotation a:an){
            System.out.println(a);//因为只有Deprecated注解使用了RUNTIME方式声明，所以运行时只能取得这个注解
        }
    }
}
