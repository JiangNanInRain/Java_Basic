package Chapter12;

import java.io.InputStream;
import java.util.SortedMap;

public class SystemDemo4 {
    public static void main(String[] args) throws  Exception {
        InputStream in = System.in;
        StringBuilder buf = new StringBuilder();
        System.out.println("请输入内容:");
        int t= 0;
        while ((t=in.read())!=-1){
            char ch = (char)t;
            if(ch=='\n'){
                break;
            }
            buf.append(ch);
        }
        System.out.println("输出内容为:"+buf); //中文会乱码的，因为是按字节读的，然后在输出
        in.close();
    }
}
