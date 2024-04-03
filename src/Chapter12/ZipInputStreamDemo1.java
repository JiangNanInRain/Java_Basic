package Chapter12;

import com.sun.nio.zipfs.ZipFileSystemProvider;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

public class ZipInputStreamDemo1 {
    public static void main(String[] args) throws Exception{
        ZipFile zipFile = new ZipFile(new File("C:"+File.separator+"JavaTest"+File.separator+"test226.zip"));
        ZipInputStream zis = new ZipInputStream(new FileInputStream(new File("C:"+File.separator+"JavaTest"+File.separator+"test226.zip")));
        ZipEntry entry = null;
        File outFile = null;
        InputStream in = null;
        OutputStream out = null;
        while ((entry = zis.getNextEntry())!=null){
            System.out.println("解压缩"+entry.getName()+"文件");
            outFile = new File("C:"+File.separator+"JavaTest"+File.separator+entry.getName());
            if(!outFile.getParentFile().exists()){
                outFile.getParentFile().mkdir();
            }
            if(!outFile.exists()){
                outFile.createNewFile();
            }
            in = zipFile.getInputStream(entry);
            out = new FileOutputStream(outFile);
            int t =0;
            while ((t = in.read())!=-1){
                out.write(t);
            }
            in.close();
            out.close();
        }
    }
}
