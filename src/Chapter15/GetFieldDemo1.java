package Chapter15;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class GetFieldDemo1 {
    public static void main(String[] args) {
        Class<?> c = null;
        try{
            c = Class.forName("Chapter15.Person");
        }catch (Exception e){
            e.printStackTrace();
        }
        //创建一个普通代码块
        {
            Field[] f = c.getDeclaredFields(); //Person类本类的属性
            for(int i = 0;i<f.length;i++){
                Class<?> type = f[i].getType();
                int mod = f[i].getModifiers();
                String priv = Modifier.toString(mod);
                System.out.print(priv+" "+type.getName()+"  " +f[i].getName());
                System.out.println(";");
            }
        }
        //
        System.out.println("--------------------------------");
        //实现的接口或者爹类的属性
        {
            Field[] f = c.getFields();
            for(int i = 0;i<f.length;i++){
                Class<?> type = f[i].getType();
                int mod = f[i].getModifiers();
                String priv = Modifier.toString(mod);
                System.out.print(priv+" "+type.getName()+"  " +f[i].getName());
                System.out.println(";");
            }
        }


     }
}
