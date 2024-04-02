package Chapter12;

import java.io.OutputStream;
import java.io.StringReader;

public class SystemDemo2 {
    public static void main(String[] args) {

        String str = "王义喆";
        try{
            System.out.println(Integer.parseInt(str));
        }catch (Exception e){
            System.err.println(e);
        }
    }
}
