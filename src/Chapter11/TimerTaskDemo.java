package Chapter11;


import com.sun.xml.internal.ws.encoding.StringDataContentHandler;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

class  MyTask extends TimerTask {
    public void run(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        System.out.println("现在系统时间为:"+sdf.format(new Date()));

    }

}
public class TimerTaskDemo {

    public static void main(String[] args) {
        Timer t = new Timer();  //创建一个Timer对象
        MyTask myTask = new MyTask(); //创建一个任务类，重写了Runnalbe中的run()方法，里面是线程要执行的任务
        t.schedule(myTask,1000,2000); //1秒后执行，重复频率2秒
    }
}
