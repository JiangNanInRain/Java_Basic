package Chapter15;

import java.lang.reflect.Constructor;

public class InstanceDemo2 {
    public static void main(String[] args) {

        Class<?> c = null;
        try{
            c = Class.forName("Chapter15.Person");
        }catch (Exception e){
            e.printStackTrace();
        }
        Person p =null;
        Constructor<?>[] cons = c.getConstructors(); //反射得到全部构造方法
        try {
            p = (Person) cons[1].newInstance("王义喆",99);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(p);
    }
}
