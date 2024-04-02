package Chapter12;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class SystemDemo6 {
    public static void main(String[] args) throws Exception{
        System.setIn(new FileInputStream("C:"+ File.separator+"test.txt"));
        InputStream in = System.in;
        byte[]  b = new  byte[1024];
        int len = in.read(b);
        System.out.println(new String(b,0,len));
        in.close();

    }
}
