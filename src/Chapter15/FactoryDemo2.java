package Chapter15;

import com.sun.org.apache.bcel.internal.generic.FieldGen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

class  PropertiesInit{
    public static Properties getPro(){
        Properties pro =new Properties();
        File f = new  File("C:"+ File.separator+"JavaTest"+File.separator+"Fruit.properties");
        try{
            if(f.exists()){
                pro.load(new FileInputStream(f));
            }else {
                pro.setProperty("apple","Chapter15.Apple");
                pro.setProperty("wyz","Chapter15.WYZ");
                pro.store(new FileOutputStream(f),"FRUIT CLASS");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return pro;
    }
}
public class FactoryDemo2 {//解决工厂设计模式传入类名的包名不知道的情况，将properties文件应用进来
    public static void main(String[] args) {
        Properties p = PropertiesInit.getPro();
        Fruit f =Factory.getInstance(p.getProperty("wyz"));
        if(f!=null){
            f.eat();
        }
    }
}
