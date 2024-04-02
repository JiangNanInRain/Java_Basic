package Chapter12;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class ReaderDemo1 {
    public static void main(String[] args) throws Exception{
        File f = new File("C:"+File.separator+"test.txt");
        Reader in = new FileReader(f);

        char[] ch = new char[1024];
        int len = 0;
        int t = 0;
        while ( (t = in.read())!= -1){
            ch[len++] = (char)t;
        }
        System.out.println(new String(ch,0,len));

    }
}
