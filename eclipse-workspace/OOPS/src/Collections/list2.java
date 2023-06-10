package Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class list2 {
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> arrayList) {
        HashSet<Integer> set = new HashSet<>(arrayList);
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(5);

        ArrayList<Integer> newList = removeDuplicates(arrayList);
        System.out.println(newList);  // Output: [1, 2, 3, 4, 5]
    }
}
