package Chapter9;

class MyThread1 implements Runnable{
    public void  run() {
        while (true)System.out.println(Thread.currentThread().getName()+"运行!");
    }
}
public class ThreadNameDemo1 {
    public static void main(String[] args)throws Exception {
        MyThread1 t1 = new MyThread1();
//        new Thread(t1).start();
//        new Thread(t1,"赵甜宇").start();
        Thread wyz = new  Thread(t1,"王义喆");

//        new Thread(t1).start();
//        new Thread(t1).start();
//        Thread.sleep(100);
//        wyz.interrupt();
        wyz.setDaemon(true);
        wyz.start();
    }
}
