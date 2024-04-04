package Chapter15;

import javax.swing.text.html.ObjectView;
import java.lang.reflect.Method;
import java.util.SplittableRandom;

public class InvokeSetGetDemo1 {
    public static void main(String[] args) {
        Class<?> c = null;
        Object obj =null;
        try{
            c = Class.forName("Chapter15.Person");
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            obj =c.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        setter(obj,"name","王义喆",String.class);
        setter(obj,"age",99,int.class);
        getter(obj,"name");
        getter(obj,"age");




    }
    /**
     * @param obj 操作对象
     * @param att 操作的属性
     * @param value 设置的值
     * @param type 参数类型
     */
    public static void setter(Object obj , String att, Object value,Class<?> type){
       try {
           Method met = obj.getClass().getMethod("set"+initStr(att),type);
           met.invoke(obj,value);
       }catch (Exception e){
           e.printStackTrace();
       }

    }
    public static void getter(Object obj,String att){
        try {
            Method met = obj.getClass().getMethod("get"+initStr(att));
            System.out.println(met.invoke(obj)); //调用
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static  String  initStr(String old){
        String str = old.substring(0,1).toUpperCase()+old.substring(1);
        return  str;
    }
}
