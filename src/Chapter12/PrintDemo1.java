package Chapter12;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintDemo1 {
    public static void main(String[] args) throws Exception {
        PrintStream ps = new PrintStream(new FileOutputStream(new File("C:"+File.separator+"test.txt")));
        ps.println("王义喆别打搅了!!!");
        ps.print("还不去复习！");
        ps.println();
        String name = "王义喆";
        int age = 99;
        float score =59.9f;
        ps.printf("年龄: %s ;年龄: %d ;成绩: %f",name,age,score);
        ps.close();
    }
}
