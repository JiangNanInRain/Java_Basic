package Chapter12;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        File f = new File("C:"+File.separator+"test.txt");
        if(f.exists()){
            f.delete();
            System.out.println("删除");
        }else {
            try {
                f.createNewFile();
                System.out.println( "创建成功");
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        File f2 = new File("C:"+File.separator+"AAAA");
        if(f2.getParentFile().exists()){
            f2.mkdir();
        }

        File f3 = new File("C:"+File.separator);
        String[] str = f3.list();
        for(String ss:str){
            System.out.print(ss+"   ");
        }


        File[] files = f3.listFiles();
        for(File ss:files){
            System.out.println(ss);
        }
        if(f3.isDirectory()){
            System.out.println(f3.getPath()+"是目录");
        }else {
            System.out.println(f3.getPath()+"不是目录");
        }



    }
}
