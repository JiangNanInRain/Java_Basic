package Chapter12;

import java.io.*;

public class DataOutputStreamDemo {
    public static void main(String[] args) throws  Exception {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(new File("C:"+File.separator)+"test.txt"));
        DataInputStream dis = new DataInputStream(new FileInputStream(new File("C:"+File.separator)+"test.txt")) ;
        String[] names = {"衬衣","手套","围巾"};
        float[] prices = {99.5f,21.34f,34.34f};
        int[] nums = {3,2,1};
        for(int i=0;i<3;i++){
            dos.writeChars(names[i]);
            dos.writeChar('\t');
            dos.writeFloat(prices[i]);
            dos.writeChar('\t');
            dos.writeInt(nums[i]);
            dos.writeChar('\n');


        }
        String name;
        float price;
        int num;
        char[] tmp;
        char ch = 0;
        int len = 0;
        try {
            while (true){
                tmp = new char[200];
                len = 0;
                while ((ch = dis.readChar())!='\t'){
                    tmp[len++] = ch;
                }
                name = new String(tmp,0,len);
                price = dis.readFloat();
                dis.readChar();
                num = dis.readInt();
                dis.readChar();
                System.out.printf("名称:%s  价格: %f  数量: %d \n",name , price,num);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        dis.close();
        dos.close();
    }
}
