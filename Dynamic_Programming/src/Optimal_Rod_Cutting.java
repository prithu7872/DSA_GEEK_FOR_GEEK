import java.util.ArrayList;

public class Optimal_Rod_Cutting {
    public static double maxRevenue(int L, int[] sizes, double[] prices) {
        if (L == 0) {
            return 0;
        }

        if (L < 0) {
            return -Integer.MAX_VALUE; // Use negative infinity for invalid rod length
        }

        int k = sizes.length;
        assert prices.length == k;

        double bestValue = 0;
        for (int i = 0; i < k; i++) {
            System.out.print("\nBestValue ->"+bestValue+" Size -> " + sizes[i] + " Price -> " + prices[i]+"Initial Length : "+L+" Final Length : "+(L-sizes[i]));
            bestValue = Math.max(bestValue, prices[i] + maxRevenue(L - sizes[i], sizes, prices));

            System.out.println("\n\nReturned Intermediate BestValue ->"+bestValue+" Size -> " + sizes[i] + " Price -> " + prices[i]+"Initial Length : "+L+" Final Length : "+(L-sizes[i]));

        }
        System.out.println("\n\nFinal BestValue ->"+bestValue+" Length : "+L);
        return bestValue;
    }

    public static void main(String[] args) {
        int L = 10;
        int[] sizes = {3,4};
        double[] prices = {1.8,2};

        double maxRevenue = maxRevenue(L, sizes, prices);
        System.out.println("Maximum Revenue: " + maxRevenue);
    }
}
