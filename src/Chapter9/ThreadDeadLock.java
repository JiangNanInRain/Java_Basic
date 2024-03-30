package Chapter9;
class F{
    public void say(){
        System.out.println("费:你先道歉，我就给你道歉");
    }
    public void apologize(){
        System.out.println("费:对不起!");
    }
}
class H{
    public void say(){
        System.out.println("韩:你先道歉，我就给你道歉");
    }
    public void apologize(){
        System.out.println("韩:对不起!");
    }
}
public class ThreadDeadLock implements Runnable{
    private static F f = new F();
    private static H h = new H();
    boolean flag = false;
    public void run(){
        if (flag){
            synchronized (f){
                f.say();
                try {
                    Thread.sleep(300);
                }catch (Exception e){
                    e.printStackTrace();
                }
                synchronized (h){
                    h.apologize();
                }
            }
        }else {
            synchronized (h){
                h.say();
                try {
                    Thread.sleep(300);
                }catch (Exception e){
                    e.printStackTrace();
                }
                synchronized (f){
                    f.apologize();
                }
            }
        }
    }



    public static void main(String[] args) {
        ThreadDeadLock t1 = new ThreadDeadLock();
        ThreadDeadLock t2 = new ThreadDeadLock();
        t1.flag = false;
        t2.flag = true;
        new Thread(t1).start();
        new Thread(t2).start();



    }
}
