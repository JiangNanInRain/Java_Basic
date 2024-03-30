package Chapter9;


class MyThreadWTY implements Runnable{
    private int ticket = 5;
    public void run(){
            this.sale();
    }
    public synchronized void sale(){
        for(int i=0;i<10;i++)
        if(ticket>0){
            try{
                Thread.sleep(3000);
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("卖票:"+ticket--);
        }
    }
}
public class SyncDemo2 {
    public static void main(String[] args) {
        MyThreadWTY t = new MyThreadWTY();
        new Thread(t,"赵甜宇").start();
        new Thread(t,"王义喆").start();
    }
}
