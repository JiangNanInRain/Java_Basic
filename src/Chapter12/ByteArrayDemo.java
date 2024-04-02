package Chapter12;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class ByteArrayDemo {
    public static void main(String[] args) throws  Exception{
        String str = "王义喆！！！ABC";
        ByteArrayInputStream bis =null;
        ByteArrayOutputStream bos =null;
        bis = new ByteArrayInputStream(str.getBytes());
        bos = new ByteArrayOutputStream();

        int t = 0;
        while ( (t = bis.read())!=-1){
            char ch = (char)t;
            bos.write(Character.toLowerCase(ch));
        }
        String newStr = bos.toString();
        bis.close();
        bos.close();
        System.out.println(newStr);


    }
}
