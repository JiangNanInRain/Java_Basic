package Chapter16;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value = RetentionPolicy.RUNTIME)//JVM会把此注解也加载
@Target(ElementType.ANNOTATION_TYPE)
public @interface MyDefaultRetentionAnnotationDemo {
    public  String  name() default  "王义喆";
}
