package Chapter12;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {

        File f = new File("C:"+File.separator);
        print(f);
    }
    public  static  void print(File f){
        if(f !=null){
            if(f.isDirectory()){
                File[]  files= f.listFiles();
                if(files!=null)
                for(File file:files){
                    if(file != null) print(file);
                }
            }else {
                System.out.println(f);
            }
        }
    }
}
