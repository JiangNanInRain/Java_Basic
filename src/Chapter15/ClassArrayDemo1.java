package Chapter15;

import java.lang.reflect.Array;
import java.util.SortedMap;

public class ClassArrayDemo1 {
    public static void main(String[] args) {
        int[] t = {1,2,3};
        Class<?> c = t.getClass().getComponentType();//得到数组类Class对象
        System.out.println("类型: "+c.getName());
        System.out.println("长度: "+ Array.getLength(t));
        System.out.println("第一个内容:"+Array.get(t,0));
        Array.set(t,0,9);//修改
        System.out.println("第一个内容:"+Array.get(t,0));
    }
}
