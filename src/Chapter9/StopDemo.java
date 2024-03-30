package Chapter9;

class MyThreadFinal implements Runnable{
    private boolean flag =true;
    public void run(){
        while (this.flag){
            System.out.println(Thread.currentThread().getName()+"开始发电");
        }
    }
    public void stop(){
        this.flag = false;
    }
}
public class StopDemo {
    public static void main(String[] args) throws Exception{
        MyThreadFinal my =new MyThreadFinal();
        MyThreadFinal my2 =new MyThreadFinal();
        new Thread(my,"王义喆").start();
        new Thread(my2,"赵甜宇").start();
        Thread.sleep(3000);
        my.stop();

    }
}
