package Chapter12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderDemo1 {
    public static void main(String[] args) {
        BufferedReader buf = new BufferedReader((new InputStreamReader(System.in)));
        String str =null;
        System.out.println("请输入内容:");
        try {
            str = buf.readLine();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(str);
    }
}
