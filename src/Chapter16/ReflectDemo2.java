package Chapter16;

import jdk.nashorn.internal.ir.RuntimeNode;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})//表明这个注解他只能用于方法和类接口枚举的声明
@interface MyDefaultAnnotationReflect2{
    public  String  key() default "王义喆";
    public  String  value() default  "23";
}
class SimpleBeanTwo{
    @SuppressWarnings("unchecked")
    @Override
    @Deprecated
    @MyDefaultAnnotationReflect2(key = "赵甜宇",value = "22")
    public String  toString(){
        return  "王义喆";
    }
}
public class ReflectDemo2 {
    public static void main(String[] args) throws  Exception {
         Class<?> c = Class.forName("Chapter16.SimpleBeanTwo");
        Method met = c.getMethod("toString");
        if(met.isAnnotationPresent(MyDefaultAnnotationReflect2.class)){//指定Annotation
             MyDefaultAnnotationReflect2 m = met.getAnnotation(MyDefaultAnnotationReflect2.class);
             String  key = m.key();
             String value = m.value();
            System.out.println( key +"  "+value);


        }
    }
}
