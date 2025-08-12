package lambdasAndStreams.LambdaComparator;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class FruitFilter {

    public static List<String> filterFruitsStartingWithA(List<String> fruits) {
        List<String> filterFruitsStartingWithA = fruits.stream().filter(x -> x.startsWith("A")).collect(Collectors.toList());
        return filterFruitsStartingWithA;
    }


    public static List<String> sortAnimalsByLengthDescending(List<String> animals) {
        List<String> sortedAnimalList = animals.stream().sorted((a,b)->Integer.compare(b.length(), a.length())).collect(Collectors.toList());
        return  sortedAnimalList;
    }

    public static String concatAllFruits(List<String> fruits) {
        return fruits.stream().collect(Collectors.joining(","));
    }

    public static Map<Integer, List<String>> groupedByLength(List<String> fruits) {
        Map<Integer, List<String>> groupedLength = fruits.stream().collect(Collectors.groupingBy(String::length));
        return groupedLength;
    }

    public static Set<String> uniqueFruits(List<String> fruits) {
        Set<String> fr = fruits.stream().collect(Collectors.toSet());
        return fr;
    }

    public static boolean allMatch(List<String> fruits) {
        boolean isAllMatch = fruits.parallelStream().allMatch(w -> w.length() > 3);
        return isAllMatch;
    }

    public static int processSentences(List<String> sentences) {
        //code here

      int val = (int) sentences.stream().filter(x -> x.contains("Java"))
                .mapToInt(x -> x.length())
                .average().orElse(0);

        return val;
    }

    public static long countWords(List<String> sentences) {

      List<String> list =   sentences.stream().filter(x -> !x.contains("Java")).
              collect(Collectors.toList());
      System.out.println("countWords: "+ list);
        return -1L;
    }
    public static void main(String[] args) {
        List<String> allFruits = Arrays.asList("Apple", "Banana", "Apricot", "Avocado", "o");

        List<String> fruitsStartingWithA = filterFruitsStartingWithA(allFruits);
        System.out.println("fruitsStartingWithA: "+ fruitsStartingWithA);

        List<String> animals = Arrays.asList("zebra", "lion", "tiger", "elephant", "giraffe");
        animals = Arrays.asList("a","b","d","c","a");
        List<String> sortedAnimals = sortAnimalsByLengthDescending(animals);
        System.out.println(sortedAnimals);

        System.out.println("Result: " + concatAllFruits(allFruits));

        System.out.println("groupedByLength: "+ groupedByLength(allFruits));
        System.out.println("uniqueFruits: " + uniqueFruits(allFruits));

        System.out.println("All match: " + allMatch(allFruits));

        IntFunction<Integer> square = x -> x * x;
        System.out.println(square.apply(5));

        BinaryOperator<Integer> addition = (x,y) -> x + y;
        System.out.println(addition.apply(10, 20));

        Function<Integer, Integer> increment = x -> x + 1;
        System.out.println(increment.apply(7));

        List<String> sentences = Arrays.asList(
                "Java is a programming language.",
                "Python is also a good language.",
                "Java stream processing is powerful.",
                "C++ is not as popular as Java."
        );
        processSentences(sentences);
        countWords(sentences);


    }

}
