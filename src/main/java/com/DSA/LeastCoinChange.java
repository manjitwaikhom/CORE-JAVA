package com.DSA;

/**
 * Solution for the Coin Change problem using Dynamic Programming.
 * * The goal is to find the minimum number of coins needed to make a target amount.
 * If the amount cannot be made, return -1.
 */
class Solution {
    /**
     * Computes the fewest number of coins that you need to make up the given amount.
     *
     * @param coins An array of coin denominations.
     * @param amount The total target amount of money.
     * @return The fewest number of coins required, or -1 if the amount cannot be made.
     */
    public int coinChange(int[] coins, int amount) {
        // Edge case: if the target amount is 0, no coins are needed.
        if (amount == 0) {
            return 0;
        }

        // 1. Initialize DP array
        // dp[i] will store the minimum number of coins needed to make up amount i.
        // We use 'amount + 1' as a representation of infinity, as the maximum number
        // of coins needed can be at most 'amount' (e.g., all 1-cent coins).
        int[] dp = new int[amount + 1];
        int max_value = amount + 1;

        // Fill the array with the 'infinity' value.
        // dp[0] remains 0, as 0 coins are needed for amount 0.
        java.util.Arrays.fill(dp, max_value);
        dp[0] = 0;

        // 2. Build the DP table
        // Iterate through every possible amount from 1 up to the target amount.
        for (int i = 1; i <= amount; i++) {
            // Iterate through every coin denomination.
            for (int coin : coins) {
                // If the current coin denomination is less than or equal to the current amount i,
                // we can potentially use this coin to form the amount i.
                if (coin <= i) {
                    // Recurrence Relation:
                    // dp[i] = min(dp[i], 1 + dp[i - coin])
                    // We check if using the current 'coin' results in a smaller total number of coins
                    // than the previously calculated minimum for amount 'i'.
                    // 1 + dp[i - coin] means:
                    // 1 (for the current coin) + minimum coins for the remaining amount (i - coin).
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
        }

        // 3. Return the result
        // If dp[amount] is still 'max_value', it means the amount could not be made up
        // by any combination of the given coins.
        return dp[amount] > amount ? -1 : dp[amount];
    }
}

// Example of how to use this (optional, for testing):
public class LeastCoinChange {
    public static void main(String[] args) {
        Solution solver = new Solution();
        int[] coins1 = {1, 2, 5};
        int amount1 = 11;
        // Expected: 3 (5 + 5 + 1)
        System.out.println("Amount 11 with coins {1, 2, 5}: " + solver.coinChange(coins1, amount1));

        int[] coins2 = {2};
        int amount2 = 3;
        // Expected: -1 (Cannot make 3 with only 2s)
        System.out.println("Amount 3 with coins {2}: " + solver.coinChange(coins2, amount2));
    }
}


