package Chapter11;

class P{



    public  void finalize()throws Throwable{
        System.out.println("王义喆被清理了！");
    }
}

public class SystemDemp2 {
    public static void main(String[] args) {
        P wyz = new P();
        wyz = null;
        System.gc();
    }
}
