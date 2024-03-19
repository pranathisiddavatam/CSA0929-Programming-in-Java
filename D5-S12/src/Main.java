import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
class CommonElements {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {2, 4, 5, 6, 7};

        List<Integer> commonElements = findCommonElements(array1, array2);

        System.out.println("Common elements: " + commonElements);
    }

    public static List<Integer> findCommonElements(int[] array1, int[] array2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        List<Integer> commonElements = new ArrayList<>();

        // Add elements of array1 to set1
        for (int num : array1) {
            set1.add(num);
        }

        // Add elements of array2 to set2
        for (int num : array2) {
            set2.add(num);
        }

        // Find common elements between set1 and set2
        for (int num : set1) {
            if (set2.contains(num)) {
                commonElements.add(num);
            }
        }

        return commonElements;
    }
}
