package Chapter11;

class Clo implements Cloneable{
    private String name = null;

    public Clo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString() {
        return "Clo{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class CloneDemo1 {
    public static void main(String[] args) throws Exception{
        Clo c1 = new Clo("王义喆");
        Clo c2 = (Clo)c1.clone();
        System.out.println(c1);


    }
}
