package Chapter16;

@Deprecated
class  Demo2<T>{

    private T var;

    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }
}
public class SuppressWarningAnnotationDemo1 {
    @SuppressWarnings({"unchecked","deprecation"}) //压制主方法的警告信息,可以写成value = {"unchecked","deprecation"}
    public static void main(String[] args) {
        Demo2 d = new Demo2() ; //泛型无声明类型警告，已被压制
        d.setVar("王义喆");
        System.out.println( d.getVar());

    }
}
