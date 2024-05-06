public class Optimal_Coin_Changing {

        public static int minCoins_recursive_1(int x, int[] lst) {
            if (x == 0) {
                return 0;
            }
            if (x < 0) {
                return 1000000; // A very large number!
            }

            int minCoins = Integer.MAX_VALUE;
            for (int ci : lst) {
                int subProblemResult = minCoins_recursive_1(x - ci, lst);
                if (subProblemResult != 1000000) { // Avoid considering invalid subproblem results
                    minCoins = Math.min(minCoins, 1 + subProblemResult);
                }
            }
            return minCoins == Integer.MAX_VALUE ? -1 : minCoins;
        }

        public static void main(String[] args) {
            int[] coins = { 2, 5, 10, 20};
            int amount = 48;
            int minCoinsRequired = minCoins_recursive_1(amount, coins);
            System.out.println("Minimum coins required: " + minCoinsRequired);
        }
    }