package Chapter14;


interface Print{
    void printColor();
}
enum Colors implements Print{
    RED{
        public void printColor(){
            System.out.println("红色");
        }
    },
    BLUE{
        public void printColor(){
            System.out.println("蓝色");
        }
    },
    GREEN{
        public void printColor(){
            System.out.println("绿色");
        }
    };
    //可以继承接口实线以上的效果，只需要如下定义抽象方法
    //public abstract void printColor();
}
public class InterfaceEnumDemo1 {
    public static void main(String[] args) {
        for(Colors c:Colors.values()){
            c.printColor();
        }
    }
}
