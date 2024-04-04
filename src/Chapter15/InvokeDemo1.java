package Chapter15;

import java.lang.reflect.Method;

public class InvokeDemo1 {
    public static void main(String[] args) {
        Class<?> c = null;
        try{
            c = Class.forName("Chapter15.Person");
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            Method met = c.getMethod("say");
            met.invoke(c.newInstance());
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
