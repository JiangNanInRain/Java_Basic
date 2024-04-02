package Chapter12;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class WriterDemo1 {
    public static void main(String[] args) throws Exception{
        File f = new File("C:"+File.separator+"test.txt");
        Writer out = new  FileWriter(f,true);
        String srt = "我是王义喆";
        out.write(srt);
        out.flush();//直接立刻输出缓冲区的字符流内容
        out.close();
    }
}
