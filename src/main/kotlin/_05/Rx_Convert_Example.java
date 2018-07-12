package _05;

import io.reactivex.Observable;
import io.reactivex.functions.Function;

import java.util.Arrays;
import java.util.List;

public class Rx_Convert_Example {

    public static void main(String... args) {
        List<String> values = Arrays.asList("Wubba lubba dub dub!".split(" "));
        List<String> dub = filterList(values, "dub", String::toUpperCase);

        System.out.println(dub);
    }

    static <T> List<T> filterList(List<String> list, String filterValue, Function<String, T> transform) {
        return Observable.fromIterable(list)
                .filter(s -> s.contains(filterValue))
                .map(transform)
                .toList()
                .blockingGet();
    }
}
