package Collections;

import java.util.ArrayList;

public class list1 {
    public static int findMaxElement(ArrayList<Integer> arrayList) {
        int maxElement = arrayList.get(0);
        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i) > maxElement) {
                maxElement = arrayList.get(i);
            }
        }
        return maxElement;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(3);
        arrayList.add(9);
        arrayList.add(1);
        arrayList.add(7);

        int maxElement = findMaxElement(arrayList);
        System.out.println(maxElement);  // Output: 9
    }
}
