package Chapter15;

public class ClassLoaderDemo1 {
    public static void main(String[] args) {
        Class<?> c = ClassLoaderDemo1.class;
        System.out.println(c.getClassLoader());
        System.out.println(c.getClassLoader().getParent());

    }
}
