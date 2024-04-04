package Chapter15;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class InstanceDemo3 {
    public static void main(String[] args) {
        Class<?> c=null;
        try {
            c  =Class.forName("Chapter15.Person");
        }catch (Exception e){
            e.printStackTrace();
        }
        Class<?>[] c1 = c.getInterfaces();
        for(Class<?> cc:c1){
            System.out.println(cc.getName());//我懒没继承接口，所以是空的

        }
        System.out.println(c.getSuperclass().getName());

        Constructor<?> con[] = c.getConstructors();
        for(int i=0;i<con.length;i++){
            //System.out.println(con[i]);
            Class<?>[] p = con[i].getParameterTypes();//构造方法的参数类型
            int mod = con[i].getModifiers();
            System.out.print(Modifier.toString(mod) +" ");//权限
            System.out.print(con[i].getName()+" ");//名称
            System.out.print("(");

            for(int j=0;j<p.length;j++){
                System.out.print(p[j].getName()+"arg"+(j+1));
            }
            System.out.println("){}");
        }
    }
}
