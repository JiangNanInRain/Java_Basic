package Chapter11;

import java.util.concurrent.ExecutionException;

public class RuntimeDemo2 {
    public static void main(String[] args) {
        Runtime run = Runtime.getRuntime() ;
        Process p =null;
        try {
              p= run.exec("notepad.exe");
        }catch (Exception e){
            e.printStackTrace();
        }

        try {
             Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
        p.destroy();

    }
}
