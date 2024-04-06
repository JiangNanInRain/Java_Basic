package Chapter16;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionInterfaceDemo{
    public static void main(String[] args) {
        Function<String, Boolean> fun  = "abcWYZ"::startsWith;
        System.out.println(fun.apply("ab"));

        Consumer<String> cons = System.out::println;
        cons.accept("王义喆");

        Supplier<String> sp = "wyz"::toUpperCase;
        System.out.println(sp.get());

        Predicate<String> p  ="wyz"::equalsIgnoreCase;
        System.out.println(p.test("WYz"));
    }
}

