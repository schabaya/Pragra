package soortt;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.LinkedHashSet;

public class Test {
    public static void main(String[] args) {
        List<Integer> originalList = List.of(10, 20, 434, 3434, 23, 53, 23, 20, 43, 55, 434, 3434);
        Set<Integer> uniqueSet = new LinkedHashSet<>(originalList);

        System.out.println(uniqueSet);
    }
}
