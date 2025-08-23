package myStream;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numberRandom =  new Random()
                .ints(100,1,1001)
                .boxed()
                .collect(Collectors.toList());

        // Task 1
        streamForTaskOne(numberRandom);

        // Проверка filter()
        List<String> words = Arrays.asList("apple", "banana", "avocado", "cherry");
        Collection<String> filteredWords = filter(words, w -> w.startsWith("a"));
        System.out.println(filteredWords);

        // Проверка filterString()
        String joined = filterString(words, w -> w.length() > 5);
        System.out.println(joined);

        // Проверка sortUnique()
        List<Integer> nums = Arrays.asList(5, 3, 9, 3, 7, 1, 9, 2);
        System.out.println("Sort ASC " + sortUnique(nums, "ASC"));
        System.out.println("Sort DESC " + sortUnique(nums, "DESC"));

        // Проверка factorial()
        System.out.println(factorial(5));
    }
    public static void streamForTaskOne(List<Integer> numbers) {
        List<Integer> result = numbers.stream()
                .sorted()
                .limit(10)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println( "Task-1 " + result);
    }

    public static <T>Collection<T> filter (Collection<T> collection, Predicate<T> predicate) {
        return collection.stream().filter(predicate).collect(Collectors.toList());
    }

    public static String filterString(Collection<String> collection, Predicate<String> predicate){
        return String.join("|", filter(collection, predicate));
    }

    public static Collection<Integer> sortUnique(Collection<Integer> collection, String sortDirection) {
        Comparator<Integer> comparator = "DESC".equalsIgnoreCase(sortDirection) ? Comparator.reverseOrder() : Comparator.naturalOrder();
        return collection.stream().distinct().sorted(comparator).collect(Collectors.toList());
    }

    public static int factorial(Integer number){
        return IntStream.rangeClosed(1,number).reduce(1, (x, y) -> x * y);

    }
}
