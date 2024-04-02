package Chapter12;

import javafx.scene.input.InputMethodTextRun;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamDemo1 {
    public static void main(String[] args) throws Exception{

        File f = new File("C:"+File.separator+"test.txt");

        InputStream in = new FileInputStream(f);

        byte[] b = new byte[(int)f.length()];
        int len =  in.read(b); //获取读入的字节数
        in.close();
        System.out.println(new String(b,0,len));

    }
}
