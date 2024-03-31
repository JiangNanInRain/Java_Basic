package Chapter11;

import com.sun.corba.se.impl.legacy.connection.USLPort;

public class RuntimeDemo1 {
    public static void main(String[] args) {
        Runtime run = Runtime.getRuntime();
        System.out.println("JVM最大内存容量:"+run.maxMemory());
        System.out.println("JVM空闲内存容量:"+run.freeMemory());

        String str = "";
        int i = 1000;
        while (i-->0){
            str+="王义喆";
        }

        System.out.println("JVM空闲内存容量:"+run.freeMemory());

        run.gc();


        System.out.println("JVM空闲内存容量:"+run.freeMemory());

    }
}
