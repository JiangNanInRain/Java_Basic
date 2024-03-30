package Chapter9;


class MyThreadZTY implements Runnable{
    private int tickets =5;
    public void run(){
        for(int i=0;i<10;i++)
        synchronized (this){
            if(tickets>0){
                try{
                    Thread.sleep(300);
                }catch (Exception e){
                    e.printStackTrace();
                }
                System.out.println("卖票:ticket = "+tickets--);
            }

        }
    }
}
public class SyncDemo1 {
    public static void main(String[] args) {
        MyThreadZTY t = new MyThreadZTY();
        new Thread(t,"王义喆").start();
        new Thread(t,"赵甜宇").start();

    }
}
