package Chapter12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.LinkPermission;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamDemo2 {
    public static void main(String[] args) throws Exception{
        File file = new File("C:"+ File.separator+"JavaTest"+File.separator+"test226");
        File zipFile = new File("C:"+ File.separator+"JavaTest"+File.separator+"test226.zip");
        InputStream in = null;
        ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(zipFile));
        zipOut.setComment("test226zip");
        if(file.isDirectory()){
            File[] files = file.listFiles();
            for(int i = 0;i<files.length;i++){
                in = new FileInputStream(files[i]);
                zipOut.putNextEntry(new ZipEntry(file.getName()+File.separator+ files[i].getName()));
                zipOut.setComment("王义喆");
                int t =0;
                while ((t = in.read())!=-1){
                    zipOut.write(t);
                }
                in.close();


            }
        }
        zipOut.close();

    }
}
