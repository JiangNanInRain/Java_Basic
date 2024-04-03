package Chapter12;

import java.io.*;

public class SequenceDemo {
    public static void main(String[] args) throws Exception{
        InputStream is1 = new FileInputStream("C:"+ File.separator+"test1.txt");
        InputStream is2 = new FileInputStream("C:"+ File.separator+"test2.txt");
        OutputStream os = new FileOutputStream("C:"+ File.separator+"test12.txt");
        SequenceInputStream sis = new SequenceInputStream(is1,is2);
        int t=0;
        while ((t=sis.read())!=-1){
            os.write(t);
        }
        sis.close();
        is1.close();
        is2.close();
        os.close();

    }
}
