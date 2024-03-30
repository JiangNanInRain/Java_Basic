package Chapter7;


class Math{
    public int div(int i,int j)throws Exception{
        System.out.println("计算开始");
        int t=0;
//        try{
            t = i/j;
//        }catch (Exception e){
//            throw e;
//        }finally {
//            System.out.println("计算结束");
//        }
        return t;
    }
}
public class ThrowDemo1 {
    public static void main(String[] args) {
        Math m = new Math();
        try{
            System.out.println(m.div(10,0));
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("ys");
        }
    }
}
