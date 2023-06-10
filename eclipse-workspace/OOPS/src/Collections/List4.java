package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class List4 {
    public static int findKthLargestElement(ArrayList<Integer> arrayList, int k) {
        Collections.sort(arrayList, Collections.reverseOrder());
        return arrayList.get(k - 1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(3);
        arrayList.add(9);
        arrayList.add(1);
        arrayList.add(7);

        int kthLargestElement = findKthLargestElement(arrayList, 2);
        System.out.println(kthLargestElement);  // Output: 7
    }
}

