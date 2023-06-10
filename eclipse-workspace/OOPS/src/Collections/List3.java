package Collections;

import java.util.ArrayList;

public class List3 {
    public static boolean isSortedAscending(ArrayList<Integer> arrayList) {
        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i) < arrayList.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList1.add(4);
        System.out.println(isSortedAscending(arrayList1));  // Output: true

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(5);
        arrayList2.add(3);
        arrayList2.add(9);
        arrayList2.add(1);
        arrayList2.add(7);
        System.out.println(isSortedAscending(arrayList2));  // Output: false
    }
}
