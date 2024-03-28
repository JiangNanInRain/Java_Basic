package Chapter6;

class Array {
    private int[] temp;
    private int foot;//记录数据添加的下标位置

    public Array(int len){
        if(len>0){
            this.temp = new int[len];
        }else {
            this.temp = new int[1];
        }
    }

    public boolean add(int i){
        if(this.foot<this.temp.length){
            this.temp[foot++] = i;
            return  true;
        }else {
            return false;
        }
    }

    public int[] getArray(){
        return this.temp;
    }




}

class ReverseArray extends Array{
    public ReverseArray(int len){
        super(len);
    }

    public int[] getArray(){
        int center = super.getArray().length/2;
        int head = 0;
        int tail = super.getArray().length-1;
        for (int x=0;x<center;x++){
            int temp = super.getArray()[head];
            super.getArray()[head] = super.getArray()[tail];
            super.getArray()[tail] = temp;
            head++;
            tail--;
        }
        return super.getArray();
    }


}

class SortArray extends Array{
    public SortArray(int len){
        super(len);
    }

    public int[] getArray(){
        java.util.Arrays.sort(super.getArray());
        return super.getArray();
    }

}

public class ArrayDemo {
    public static void main(String[] args) {
        ReverseArray a = new ReverseArray(3);
        System.out.println(a.add(1));
        System.out.println(a.add(3));
        System.out.println(a.add(2));

        for(int n:a.getArray()){
            System.out.print(n+" ");
        }
        System.out.println("-------------------");
        SortArray b = new SortArray(3);
        System.out.println(b.add(1));
        System.out.println(b.add(3));
        System.out.println(b.add(2));

        for(int n:b.getArray()){
            System.out.print(n+" ");
        }


    }
}
