package Chapter13;

import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo1 {
    public static void main(String[] args) {
        Properties p = new Properties();
        p.setProperty("王义喆","原神");
        p.setProperty("王义喆","原神");
        p.setProperty("王义喆","原神");
        p.setProperty("王义喆","原神");
        File f = new File("C:"+File.separator+"JavaTest"+File.separator+"test.properties");
        try{
            p.store(new FileOutputStream(f),"原神");//反之load
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
