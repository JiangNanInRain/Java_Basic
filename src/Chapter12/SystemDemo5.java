package Chapter12;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class SystemDemo5 {
    public static void main(String[] args) throws Exception{
        ByteArrayOutputStream bos =new ByteArrayOutputStream();
        System.setErr(new PrintStream(new FileOutputStream("C:"+ File.separator+"test.txt")));
        System.out.println("王义喆是究极无敌超级宇宙大铸币！！！！！！！！！！");
        System.out.println("无敌了！");
        System.setErr(new PrintStream(bos));
        System.err.println("牛逼");
        System.out.println(bos);
    }
}
