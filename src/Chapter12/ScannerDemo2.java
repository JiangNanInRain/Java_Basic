package Chapter12;

import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("输入日期:");
        String str ;
        Date date = null;
        if(scan.hasNext("^\\d{4}-\\d{2}-\\d{2}$")){
            str = scan.next("^\\d{4}-\\d{2}-\\d{2}$");
            try{
                date = new SimpleDateFormat("yyyy-MM-dd").parse(str);
            }catch (Exception e){
                e.printStackTrace();
            }

        }else {
            System.out.println("输入的日期格式有误!");
        }
        System.out.println(date);

    }
}
