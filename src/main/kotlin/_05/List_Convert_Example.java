package _05;

import kotlin.Pair;

import java.util.ArrayList;
import java.util.List;

public abstract class List_Convert_Example {
    public static List<String> convert(List<Pair<String, Integer>> pairs) {
        List<String> returnValue = new ArrayList<>();
        for (Pair<String, Integer> pair : pairs) {
            returnValue.add(pair.getFirst());
        }
        return returnValue;
    }
}
