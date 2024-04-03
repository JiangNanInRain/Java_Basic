package Chapter12;
import java.io.ByteArrayInputStream;
import java.io.PushbackInputStream;
public class PushbackInputStreamDemo1 {
    public static void main(String[] args) throws Exception{
        String str = "www.jninrain.club";
        PushbackInputStream push = null;  //回退流
        ByteArrayInputStream bais = null; //内存输入流
        bais = new ByteArrayInputStream(str.getBytes());
        push = new PushbackInputStream(bais);
        System.out.println("读取之后的数据为:");
        int t =0;
        while ((t = push.read())!=-1){
            if(t == '.'){
                push.unread(t);
                t = push .read();
                System.out.print("（回退"+(char)t+")");//回退的用法
            }else {
                System.out.print((char)t);
            }
        }

    }
}
