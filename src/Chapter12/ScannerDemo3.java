package Chapter12;

import java.io.EOFException;
import java.io.File;
import java.util.Scanner;

public class ScannerDemo3 {
    public static void main(String[] args) {
        File f = new File("C:"+File.separator+"test.txt");
        Scanner sc = null;
        try{
            sc = new Scanner(f);
        }catch (Exception e){
            e.printStackTrace();
        }
        StringBuilder sb = new StringBuilder();
        while(sc.hasNext()){
            sb.append(sc.next()).append("\n");
        }
        System.out.println(sb);
    }
}
