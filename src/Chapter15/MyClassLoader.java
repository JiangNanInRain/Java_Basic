package Chapter15;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;

public class MyClassLoader extends ClassLoader{
    public Class<?> getMyClass(String className)throws ClassNotFoundException{
        byte[] d = this.getFileData(className);
        return super.defineClass(className,d,0,d.length);//加载类文件数据
    }
    private byte[] getFileData(String className){
        byte[] ret = null;
        try {
            File file =new File("C:"+File.separator
                        +className.substring(className.lastIndexOf(".")+1)
                        +".class");//类文件的加载路径

            InputStream in = new FileInputStream(file);
            ByteArrayOutputStream bos =new ByteArrayOutputStream();
            byte[] data = new byte[1024];
            int len =0;
            while ((len =in.read(data))!=-1){
                bos.write(data,0,len);
            }
            ret = bos.toByteArray();
            bos.close();
            in.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return ret;
    }
}
