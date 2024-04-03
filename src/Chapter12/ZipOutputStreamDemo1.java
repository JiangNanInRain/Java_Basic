package Chapter12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamDemo1 {
    public static void main(String[] args) throws Exception{
        InputStream in = new FileInputStream(new File("C:"+File.separator+"test12.txt"));
        ZipOutputStream ziso = null;
        ziso = new ZipOutputStream(new FileOutputStream(new File("C:"+File.separator+"wyztest.zip")));
        ziso.putNextEntry(new ZipEntry("test12.txt")); //创建ZipEntry
        ziso.setComment("王义喆"); //注释
        int t = 0;
        while ((t = in.read())!=-1){
            ziso.write(t);
        }
        in.close();
        ziso.close();
    }
}
