import java.util.*;

public class SetIntersection {
    public static void main(String[] args) {
        // Create two sets
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));

        // Display the original sets
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        // Find the intersection manually
        Set<Integer> intersection = new HashSet<>();

        for (Integer num : set1) {
            if (set2.contains(num)) {
                intersection.add(num);
            }
        }

        // Display the intersection
        System.out.println("Intersection: " + intersection);
    }
}
