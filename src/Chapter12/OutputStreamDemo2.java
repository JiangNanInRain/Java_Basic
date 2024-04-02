package Chapter12;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamDemo2 {
    public static void main(String[] args)throws Exception  {

        //第一步，创建一个File类
        File f1 = new File("C:"+File.separator+"test.txt");
        //第二步通过子类实例化父类输出流对象
        OutputStream out = new FileOutputStream(f1,true);//指定在文件末尾追加内容
        //3写入
        String  str= "铸币王义喆";
        byte[]  b = str.getBytes();//转字节


        for(byte by:b){
            out.write(by);
        }

        //关闭
        out.close();

    }
}
