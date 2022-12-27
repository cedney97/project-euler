package Problem21;

public class AmicablePairs {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i < 10000; ++i) {
            int sumOfDivs = 0;
            for (int j = 1; j < i; ++j) {
                if (i % j == 0) {
                    sumOfDivs += j;
                }
            }
            // System.out.println(i + ": " + sumOfDivs);
            if (sumOfDivs != i) {
                int newSumOfDivs = 0;
                for (int j = 1; j < sumOfDivs; ++j) {
                    if (sumOfDivs % j == 0) {
                        newSumOfDivs += j;
                    } 
                }
                if (newSumOfDivs == i) {
                    sum += i + sumOfDivs;
                }
            }
        }
        System.out.println(sum / 2);
    }
}