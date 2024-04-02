package Chapter12;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamDemo2 {
    public static void main(String[] args) throws Exception{
        File f = new File("C:"+File.separator+"test.txt");

        InputStream in = new FileInputStream(f);

        byte[] b = new byte[1024];
        int len =  0;
        int t = 0;
        while ((t = in.read())!=-1){
            b[len++] = (byte) t;

        }
        in.close();
        System.out.println(new String(b,0,len));

    }
}
