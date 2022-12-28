package Problem23;

import java.util.LinkedList;
import java.util.List;

public class NonabundantSums {
    public static final int MAX1 = 28123;
    public static final int MAX2 = 28123;

    public static void main(String[] args) {
        List<Integer> abNums = getAbundantNumbers();
        int sum = 0;

        for (int i = 1; i < MAX1; ++i) {
            if (i % 100 == 0) {
                System.out.println(i);
            }
            boolean sumOf = false;
            for (int j : abNums) {
                int test = i - j;
                if (abNums.contains(test)) {
                    sumOf = true;
                    break;
                }
            }
            if (!sumOf) {
                sum += 1;
            }
        }
        System.out.println(sum);
    }

    public static int getAbundance(int n) {
        int sum = 0;
        for (int i = 1; i < n; ++i) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static List<Integer> getAbundantNumbers() {
        List<Integer> nums = new LinkedList<>();
        for (int i = 1; i < MAX2; ++i) {
            if (getAbundance(i) > i) {
                nums.add(i);
            }
        }
        return nums;
    }
}
