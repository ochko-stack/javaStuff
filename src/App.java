import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        // *** Reverse a String in One Line *** //
        String reversed = new StringBuilder("hello").reverse().toString();
        System.out.println(reversed);

        // *** Find the Maximum Element in a List *** //
        List<Integer> list = Arrays.asList(3, 5, 7, 2, 8);
        int max = list.stream().max(Integer::compare).get();
        int min = list.stream().min(Integer::compare).orElseThrow();
        System.out.println(max);
        System.out.println(min);


        // *** Generate a Random Number Between 1 and 100 *** //
        int random = new Random().nextInt(100) + 1;
        System.out.println(random);

        // ***  Check if a String Is a Palindrome *** //

        String str = "racecar";
        boolean isPalindrome = str.equals(new StringBuilder(str).reverse().toString());
        System.out.println(isPalindrome);

        // ***  Convert a List of Strings to Uppercase *** //
        List<String> list1 = Arrays.asList("apple", "banana", "cherry");
        List<String> upper = list1.stream().map(String::toUpperCase).toList();
        System.out.println(upper);

        // ***  Count the Frequency of Words in a String *** //

        String str1 = "hello world hello";
        Map<String, Long> freq = Arrays.stream(str1.split(" ")).collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println(freq);


        // ***  Get the First Non-Repeated Character in a String *** //

        String str2 = "swiss";
        char result = str2.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                  .entrySet().stream().filter(e -> e.getValue() == 1).findFirst().get().getKey();
        System.out.println(result);


        // ***  list.sort(Comparator.reverseOrder()); *** //
        List<Integer> list2 = Arrays.asList(3, 5, 7, 2, 8);
        list2.sort(Comparator.reverseOrder());
        System.out.println(list2);


        // ***  Join a List into a Single String *** //
        List<String> list3 = Arrays.asList("apple", "banana", "cherry");
        String joined = String.join(", ", list3);
        System.out.println(joined);

    }
}
