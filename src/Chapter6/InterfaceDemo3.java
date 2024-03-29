package Chapter6;

interface  USB{
     void start();
     void stop();
}


class Computer{
    public static void plugin(USB usb){
        usb.start();
        System.out.println("USB设备工作中");
        usb.stop();
    }
}



class Flash implements USB{
    public void start(){
        System.out.println("U盘开始工作");
    }
    public void stop(){
        System.out.println("U盘停止工作");
    }
}

class Printer implements USB{
    public void start(){
        System.out.println("打印机开始工作");
    }
    public void stop(){
        System.out.println("打印机停止工作");
    }
}
public class InterfaceDemo3 {
    public static void main(String[] args) {
        Computer.plugin(new Flash());
        Computer.plugin(new Printer());
    }
}
