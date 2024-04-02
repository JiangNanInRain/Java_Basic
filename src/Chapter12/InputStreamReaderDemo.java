package Chapter12;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderDemo {
    public static void main(String[] args) throws Exception{
        File f = new File("C:"+File.separator+"test.txt");
        Reader in = new InputStreamReader(new FileInputStream(f));
        char[] ch = new char[1024];
        int len =  in.read(ch);
        in.close();
        System.out.println(new String(ch,0,len));
    }
}
