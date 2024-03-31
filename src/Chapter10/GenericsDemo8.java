package Chapter10;

public class GenericsDemo8 {
    public static void main(String[] args) {
        Integer[] i =fun1(1,2,2,3,6);
        fun2(i);
    }
    public  static <T> T[] fun1(T... arg){//可变参数列表
        return arg;
    }

    public  static  <T> void fun2(T[] param){
        System.out.println("输出泛型数组");
        for (T t:param){
            System.out.println(t+"  ");
        }
    }
}
