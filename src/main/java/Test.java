import java.util.*;

public class Test {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Orange");

        Spliterator<String> s = list.spliterator();
        Spliterator<String> s1 = s.trySplit();
        Spliterator<String> s2 = s1.trySplit();

        s.forEachRemaining(System.out::println);
        System.out.println("-- traversing the other half of the spliterator --- ");
        s1.forEachRemaining(System.out::println);
    }
}
