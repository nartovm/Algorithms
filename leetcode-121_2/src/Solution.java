class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        if (prices.length < 2) {
            return result;
        }

        int left = 0;
        for (int right = 1; right < prices.length; right++) {
            int p1 = prices[left];
            int p2 = prices[right];
            if (p2 < p1) {
                left = right;
            }
            int profit = prices[right] - prices[left];
            result = Math.max(profit, result);
        }
        return result;
    }

    public static void main(String[] args) {
//        System.out.println(new Solution().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(new Solution().maxProfit(new int[]{1,2}));
    }
}