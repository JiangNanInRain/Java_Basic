package Chapter11;


import java.math.BigDecimal;
import java.math.BigInteger;

class MyMath{
    public static double add(double d1,double d2){
        BigDecimal b1 = new BigDecimal(d1);
        BigDecimal b2 = new BigDecimal(d2);
        return b1.add(b2).doubleValue();
    }
    public static double sub(double d1,double d2){
        BigDecimal b1 = new BigDecimal(d1);
        BigDecimal b2 = new BigDecimal(d2);
        return b1.subtract(b2).doubleValue();
    }
    public static double multiply(double d1,double d2){
        BigDecimal b1 = new BigDecimal(d1);
        BigDecimal b2 = new BigDecimal(d2);
        return b1.multiply(b2).doubleValue();
    }
    public static double div(double d1,double d2,int len){
        BigDecimal b1 = new BigDecimal(d1);
        BigDecimal b2 = new BigDecimal(d2);
        return b1.divide(b2,len,BigDecimal.ROUND_HALF_UP).doubleValue();
    }
    public static double round(double d1,int len){
        BigDecimal b1 = new BigDecimal(d1);
        BigDecimal b2 = new BigDecimal(1); //任何数字除1都为原数
        return b1.divide(b2,len,BigDecimal.ROUND_HALF_UP).doubleValue();//四舍五入操作,保留len位
    }
}
public class BigDecimalDemo {
    public static void main(String[] args) {
        System.out.println(MyMath.round(MyMath.add(10.24243,123.32),2));
        System.out.println(MyMath.round(MyMath.multiply(10.233,123.1231),4));
        System.out.println(MyMath.div(123.213,123.123,2));


    }
}
