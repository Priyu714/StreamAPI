package char_count;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String str = "abcdedewrthtdfsgfghstryfhkhgfsfhhfjkyrtyghsdhfdjgkyuyhadfgdfyjaz1234556";
        Map<Character, Long> characterIntegerMap = str.chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println();
        System.out.println(characterIntegerMap);


        List<String> cities = Arrays.asList("Pune" , "Mumbai", "Washim" , "Sangola", "Nagar");

        Map<Character, Long> characterLongMap = cities.stream().flatMapToInt( String::chars)
                .mapToObj(temp -> (char) temp)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(characterLongMap);


    }
}