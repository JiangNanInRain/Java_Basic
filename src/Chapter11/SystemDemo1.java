package Chapter11;


import java.util.Arrays;

public class SystemDemo1 {
    public static void main(String[] args) {
        //列出系统的全部属性
        System.getProperties().list(System.out);//括号里的有点看不懂



        //获取时间戳
        long st = System.currentTimeMillis();
        int[] num = new int[]{1,23,4,2,3,23,423,4234,23243,4234242,42,3423,234244,24};
        try{
            Thread.sleep(2333);
        }catch (Exception e){
            e.printStackTrace();
        }
        Arrays.sort(num);
        long et = System.currentTimeMillis();

        System.out.println((et-st)+"ms!");

    }
}
