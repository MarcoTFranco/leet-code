package mergeTwoSortedLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class MergeTwoSortedLists {

    public static void main(String[] args) {

        System.out.println(mergeTwoLists(List.of(1, 2, 4), List.of(1, 3, 4)));

    }

    public static List<Integer> mergeTwoLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> listOrdened = new ArrayList<>();
        listOrdened.addAll(list1);
        listOrdened.addAll(list2);
        List<Integer> objectsList = listOrdened.stream().sorted().toList();
        return objectsList;
    }

}
