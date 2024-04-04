package Chapter14;

import sun.plugin2.util.ColorUtil;

import java.util.EnumSet;
import java.util.Map;

public class EnumSetDemo1 {
    public static void main(String[] args) {
        EnumSet<Color>  es =EnumSet.allOf(Color.class);//noneOf方法的话，初始化里面没有Color对象
        print(es);
    }
    public static void print(EnumSet<Color> t){
        for(Color c:t){
            System.out.print(c+" -");
        }
        System.out.println();
    }
}
