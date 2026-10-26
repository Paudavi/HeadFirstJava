package Books.Lambdas;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Color {
    public void go() {
        List<String> colors = List.of("Blue", "Red", "Yellow");
        colors.forEach(color -> System.out.println(color));
    }

    public void goStream() {
        List<String> strings = List.of("List", "of", "words", "he");
        Stream<String> stream = strings.stream();
        Stream<String> limit = stream.limit(2);
        System.out.println(limit);
        List<String> result = limit.collect(Collectors.toList());
        System.out.println(result);

        // chain them!
        List<String> test0 = List.of("I", "'m", "chained", "to", "the", "rhythm.");

        List<String> result0 = test0.stream().limit(4).collect(Collectors.toList());
        System.out.println(result0);
        List<String> result1 = test0.stream().sorted((one, two) -> one.compareToIgnoreCase(two))
                .collect(Collectors.toList());
        System.out.println(result1);

    }

    public static void main(String[] args) {
        Color colorClass = new Color();
        // colorClass.go();
        colorClass.goStream();
    }
}
