package dev.nartov;

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = 0;
        for (int i = 1; i < prices.length; i++) {
            int priceI = prices[i];
            int priceMin;
            int s = priceI - ;
            if (s > profit) {
                profit = s;
            }
            if (prices[i] < prices[min]) {
                min = i;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().maxProfit(new int[]{1, 2}));
        System.out.println(new Solution().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(new Solution().maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}