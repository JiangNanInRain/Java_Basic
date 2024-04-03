package Chapter12;

import java.io.File;
import java.util.zip.ZipFile;

public class ZipFileDemo1 {
    public static void main(String[] args) throws Exception{
        File in = new File("C:"+File.separator+"JavaTest"+File.separator+"test226.zip");
        File out = new File("C:"+File.separator+"JavaTest"+File.separator+"test226_unzip.txt");
        ZipFile zipFile =new ZipFile(in);
        //.....只能对单个ZipEntry解压，建议使用下一个实例ZipInputStream解压

    }
}
