package lambdasAndStreams.LambdaComparator;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsClient {

    public static void main(String[] args) {
        List<Integer> list = List.of(2, 72, 6, 8, 84, 3, 22, 23);
        List<Integer>  checkAllMethodList = List.of(2,4,6,8,10);

        System.out.println("Check All Method: "+ checkAllMethodList.stream().allMatch(x -> x%2 ==0));
        List<Integer> filterList =  list.stream().filter(
                (x) ->  x % 2 == 0 ).collect(Collectors.toList());

        System.out.println("filter List" + filterList);

        List<Integer> sortedAdnFilter = list.stream()
                .filter(x -> x%2==0)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("sorted and filter List: "+ sortedAdnFilter);

        // map(argument) -> transform into something else using the logic mentions
        // filter even data, sort it, for every element, get it's square
        List<Integer> squareList = list.stream()
                .filter(x -> x%2 ==0)
                .sorted()
                .map((x) -> x *   x)
                .collect(Collectors.toList());


        System.out.println("SquareList: "+ squareList);


        Optional<Integer> optional = list.stream()
                .filter(x -> x % 2 ==0)
                .sorted()
                .map((x) -> x * x)
                .findAny();

        Integer value = null;
        if(optional.isPresent()) {
            value = optional.get();
        }



        System.out.println("Optional: "+ value);
    }
}
