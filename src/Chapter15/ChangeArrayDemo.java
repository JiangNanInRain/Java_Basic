package Chapter15;

import sun.nio.cs.ext.IBM037;

import java.lang.reflect.Array;

public class ChangeArrayDemo {
    public static void main(String[] args) {
        int[] t = {1,2,3};
        int[] newT = (int[])arrayInc(t,8);
        print(newT);
        System.out.println("--------------------------");
        String[] str = {"王义喆","赵甜宇"};
        String[] nS = (String[]) arrayInc(str,9);
        print(nS);
    }
    public static Object arrayInc(Object obj,int len){
        Class<?> array = obj.getClass().getComponentType();//得到对象
        Object nO = Array.newInstance(array,len);//创建新数组
        int length = Array.getLength(obj);
        System.arraycopy(obj,0,nO,0,length);
        return nO;


    }
    public static void print(Object obj){
        Class<?> c = obj.getClass();
        if(!c.isArray()){
            return;
        }
        Class<?> arr = c.getComponentType();
        System.out.println(arr.getName()+"数组的长度是:"+Array.getLength(obj));
        for(int i=0;i<Array.getLength(obj);i++){
            System.out.print(Array.get(obj,i)+"  ");
        }

    }
}
