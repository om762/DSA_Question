import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    public static void main(String[] args) {
        int set[] = {3, 4, 5, 7};
        int len = set.length;

        int numOfSubsets = 1 << len;

        List<List<Integer>> powerSet = new ArrayList<>();

        for (int i = 0; i < numOfSubsets; i++) {
            List<Integer> subset = new ArrayList<Integer>();
            for (int j = 0; j < len; j++) {
                if ((i & (1 << j)) != 0)
                    subset.add(set[j]);
            }
            powerSet.add(subset);
        }
        System.out.println(powerSet);
    }
}
