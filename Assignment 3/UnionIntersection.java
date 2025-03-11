import java.util.HashSet;
public class UnionIntersection {
    public static void main(String[] args) {
        int A[] = {1, 2, 3, 4, 5};
        int B[] = {3, 4, 5, 6, 7};

        HashSet<Integer> union = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        for (int num : A) union.add(num);
        for (int num : B) {
            if (!union.add(num)) intersection.add(num);
        }

        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }
}
