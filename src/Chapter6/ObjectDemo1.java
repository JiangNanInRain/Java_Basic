package Chapter6;

public class ObjectDemo1 {
    public static void main(String[] args) {
        int[] temp = {1,2,3,23};
        Object obj = temp;

        print(obj);

    }
    public static void print(Object obj){
        if(obj instanceof int[]){
            int[] x = (int[]) obj;
            for(int i:x){
                System.out.print(i+"-");
            }
        }
    }
}
