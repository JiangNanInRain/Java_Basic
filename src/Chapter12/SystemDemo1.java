package Chapter12;

import java.io.OutputStream;

public class SystemDemo1 {
    public static void main(String[] args) {

        OutputStream out = System.out;//该输出流像终端打印
        try{
            out.write("王义喆喜欢玩明日方舟".getBytes());
        }catch (Exception e){
            e.printStackTrace();
        }
        try{
            out.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
