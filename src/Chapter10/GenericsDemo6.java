package Chapter10;


class InfoZTY<T extends Number>{
    private T var;

    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }

    @Override
    public String toString() {
        return "InfoZTY{" +
                "var=" + this.var.toString() +
                '}';
    }
}
public class GenericsDemo6 {
    public static void main(String[] args) {
        InfoZTY<Integer> wyz = fun(30);
        System.out.println(wyz.getVar());
    }

    public static <T extends Number> InfoZTY<T> fun(T param){
        InfoZTY<T> t = new InfoZTY<>();
        t.setVar(param);
        return t;
    }

}
