package Chapter12;

import java.io.InputStream;

public class SystemDemo3 {
    public static void main(String[] args) throws  Exception {
        InputStream in = System.in;
        byte[] b = new byte[1024];
        System.out.println("请输入内容:");
        int len = in.read(b);
        System.out.println(new String(b,0,len));
        in.close();
    }
}
