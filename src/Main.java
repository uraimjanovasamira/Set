import java.util.*;


public class Main {
    public static void main(String[] args) {
        Set<Integer> list1 = new HashSet<>(Arrays.asList(1, 2, 5));
        Set<Integer> list2 = new HashSet<>(Arrays.asList(4, 1));

        System.out.println("Симметрическая разница: " + symmetricDifference(list1, list2));
    }

    public static Set<Integer> symmetricDifference(Set<Integer> list1, Set<Integer> list2) {

        Set<Integer> set = new HashSet<>(list1);

            set.removeAll(list2);



        for (Integer element : list2) {
            if (!list1.contains(element)) {
                set.add(element);
            }
        }

        return set;
    }
}


