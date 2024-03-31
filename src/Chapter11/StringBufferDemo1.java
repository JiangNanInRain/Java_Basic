package Chapter11;

public class StringBufferDemo1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append("World").append("!!!");
        sb.append("\n");
        System.out.println(sb);
    }
}
