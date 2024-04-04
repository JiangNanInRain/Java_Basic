package Chapter15;

import java.io.File;
import java.lang.reflect.Field;

public class InvokeFieldDemo1 {
    public static void main(String[] args)  throws Exception  {

        Class<?> c = null;
        Object obj = null;
        try {
            c = Class.forName("Chapter15.Person");
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            obj = c.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        Field name =c.getDeclaredField("name");
        Field age = c.getDeclaredField("age");
        name.setAccessible(true);
        age.setAccessible(true);
        name.set(obj,"王义喆");
        age.set(obj,99);
        System.out.println(name.get(obj));
        System.out.println(age.get(obj));
    }
}
