package Chapter13;

import java.util.Stack;

public class StackDemo1 {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("wyz1");
        s.push("wyz2");
        s.push("wyz3");
        s.push("wyz4");
        while (!s.empty()){
            System.out.println(s.pop());
        }
    }
}
