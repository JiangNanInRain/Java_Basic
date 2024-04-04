package Chapter15;

import sun.security.krb5.internal.crypto.CksumType;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class GetMethodDemo1 {
    public static void main(String[] args) {
        Class<?> c1 =null;
        try{
            c1  =Class.forName("Chapter15.Person");
        }catch (Exception e){
            e.printStackTrace();
        }

        Method[]  m = c1.getMethods();
        for(int i=0;i< m.length;i++){
            Class<?> ret = m[i].getReturnType();
            Class<?>[] param = m[i].getParameterTypes();

            int mod = m[i].getModifiers();
            System.out.print(Modifier.toString(mod)+" "+ret.getName()+" "+m[i].getName()+" (");
            for(int j =0;j<param.length;j++){
                System.out.print(param[j].getName()+" arg"+(j+1));
                if(j<param.length-1){
                    System.out.print(",");
                }
            }
            Class<?>[] ex = m[i].getExceptionTypes();
            if(ex.length>0){
                System.out.println(")throws ");
            }else {
                System.out.println(")");
            }
            for(int j=0;j<ex.length;j++){
                System.out.print(ex[j].getName());
                if(j<ex.length-1){
                    System.out.print(",");
                }
            }
            System.out.println();
        }
    }
}
