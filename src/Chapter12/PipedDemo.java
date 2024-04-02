package Chapter12;


import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Sender implements Runnable{
    private PipedOutputStream pos = null;
    public Sender(){
        this.pos = new PipedOutputStream();
    }
    public  void run(){
        String str = "王义喆是赵甜宇";
        try {
            this.pos.write(str.getBytes());
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            this.pos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public PipedOutputStream getPos() {
        return pos;
    }
}

class Receiver implements Runnable{
    private PipedInputStream  pis= null;
    public Receiver() {
        this.pis = new PipedInputStream();
    }

    public void run(){
        byte[] b = new byte[1024];

        int len = 0;
        try {
             len = this.pis.read(b);
        }catch (Exception e){
            e.printStackTrace();
        }

        try {
            this.pis.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(new String(b,0,len));
    }

    public PipedInputStream getPis() {
        return pis;
    }
}
public class PipedDemo {
    public static void main(String[] args) {
        Sender s = new Sender();
        Receiver r = new Receiver();
        try{
            r.getPis().connect(s.getPos());
        }catch (Exception e){
            e.printStackTrace();
        }

        new Thread(s).start();
        new Thread(r).start();

    }
}
