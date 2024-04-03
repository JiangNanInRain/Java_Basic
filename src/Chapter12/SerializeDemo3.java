package Chapter12;

import java.io.*;

public class SerializeDemo3 {
    public static void main(String[] args) throws Exception{
        Person[] ps = {new Person("王义喆",12),new Person("赵甜宇",23),new Person("相洋",24),new Person("王柯洁",22)};
        ser(ps);
        Object[] obj = dser();
        for(Object ob:obj){
            Person p =(Person)ob;
            System.out.println(p);
        }
    }
    public static void ser(Person[] ps)throws Exception{
        File f = new File("C:"+File.separator+"JavaTest"+File.separator+"SerTest.txt");
        ObjectOutputStream out  =  new  ObjectOutputStream(new FileOutputStream(f));
        out.writeObject(ps);
        out.close();
    }

    public static Object[]  dser()throws Exception{
        File f = new File("C:"+File.separator+"JavaTest"+File.separator+"SerTest.txt");
        ObjectInputStream in= new ObjectInputStream(new FileInputStream(f));
        Object[] obj = (Object[]) in.readObject();
        in.close();
        return obj;

    }

}
