package Chapter12;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.reflect.WildcardType;

public class OutputStreamWriterDemo {
    public static void main(String[] args) throws Exception{
        File f = new File("C:"+File.separator+"test.txt");
        Writer out = new OutputStreamWriter(new FileOutputStream(f,true));
        out.write("王义喆赵甜宇，蜜雪冰城甜蜜蜜！");
        out.close();

    }
}
