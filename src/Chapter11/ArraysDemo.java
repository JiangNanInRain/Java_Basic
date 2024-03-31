package Chapter11;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] t={3,5,7,9,1,2,6,8};
        Arrays.sort(t);
        System.out.println(Arrays.toString(t));
        int p = Arrays.binarySearch(t,3);//下标
        System.out.println(p);
        Arrays.fill(t,3);//用于初始化填充数组
        System.out.println(Arrays.toString(t));
    }
}
