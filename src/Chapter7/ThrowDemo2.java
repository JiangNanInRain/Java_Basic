package Chapter7;



class MyMath{
    public static int div(int i,int j)throws Exception{
        System.out.println("计算开始");
        int t = 0;
        try {
            t = i/j;
        }finally {
            System.out.println("计算结束");
        }
        return t;
    }
}
public class ThrowDemo2 {
    public static void main(String[] args) {
        try {
            System.out.println(MyMath.div(10,0));
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
