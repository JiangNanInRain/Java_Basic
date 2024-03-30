package Chapter9;


class MyThreadWYZ implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+"运行中");
            if (i==3){
                System.out.println("线程礼让");
                Thread.currentThread().yield();
                try {
                    Thread.sleep(10000);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

}
public class ThreadYieldDemo {
    public static void main(String[] args) {
        new Thread(new MyThreadWYZ(),"王义喆").start();
        new Thread(new MyThreadWYZ(),"赵甜宇").start();

    }
}
