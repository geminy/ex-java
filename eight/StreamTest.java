import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    private ArrayList<String> mStrArray = new ArrayList<>();

    public StreamTest() {
        mStrArray.add("abc");
        mStrArray.add("bcd");
        mStrArray.add("cde");
    }

    public void testStream() {
        int count = 0;
        for (String str: mStrArray) {
            if (str.contains("bc")) {
                count++;
            }
        }
        System.out.println("testStream for:" + count);

        int count2 = 0;
        Iterator<String> iter = mStrArray.iterator();
        while (iter.hasNext()) {
            String str = iter.next();
            if (str.contains("bc")) {
                count2++;
            }
        }
        System.out.println("testStream iter:" + count2);

        int count3 = (int)mStrArray.stream().filter(str -> str.contains("bc")).count();
        System.out.println("testStream stream:" + count3);
    }

    public void testStreamEarly() {
        mStrArray.stream()
                .filter(str -> {
                    System.out.println("testStreamEarly:" + str);
                    return str.contains("bc");
                })
                .count();
    }

    public void testStreamLazy() {
        mStrArray.stream()
                .filter(str -> {
                    System.out.println("testStreamLazy:" + str);
                    return str.contains("bc");
                });
    }

    public void testCollect() {
        List<String> collected = Stream.of("a", "b", "c").collect(Collectors.toList());
        List<String> collected2 = Arrays.asList("a", "b", "c");
        System.out.println("testCollect collected:" + collected);
        System.out.println("testCollect collected2:" + collected2);

    }

    public void testMap() {
        List<String> collected = Stream.of("a", "b", "hello").map(str -> str.toUpperCase()).collect(Collectors.toList());
        List<String> collected2 = Arrays.asList("A", "B", "HELLO");
        System.out.println("testMap collected:" + collected);
        System.out.println("testMap collected2:" + collected2);
    }

    public void testFlatMap() {
        List<Integer> together = Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4))
                .flatMap(numbers -> numbers.stream())
                .collect(Collectors.toList());
        List<Integer> togegher2 = Arrays.asList(1, 2, 3, 4);
        System.out.println("testFlatMap together:" + together);
        System.out.println("testFlatMap togegher2:" + togegher2);
    }

    public void testMin() {
        List<String> strings = Arrays.asList("1", "22", "333");
        String string = strings.stream()
                .min(Comparator.comparing(str -> str.length()))
                .get();
        String string2 = strings.get(0);
        System.out.println("testMin string:" + string);
        System.out.println("testMin string2:" + string2);
    }

    public void testReduce() {
        int count = Stream.of(1,2, 3).reduce(0, (acc, element) -> acc + element);
        System.out.println("testReduce reduce:" + count);

        BinaryOperator<Integer> accumulator = (acc, element) -> acc + element;
        int count2 = accumulator.apply(accumulator.apply(accumulator.apply(0, 1), 2), 3);
        System.out.println("testReduce apply:" + count2);

        int acc = 0;
        for(Integer element : Arrays.asList(1, 2, 3)) {
            acc = acc + element;
        }
        System.out.println("testReduce for:" + acc);
    }
}
