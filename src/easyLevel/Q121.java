package easyLevel;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 17 version
 * Date: 23-Feb-22
 */

public class Q121 {
    public static void main(String[] args) {
        Q121 q121 = new Q121();
        int[] prices = {7, 6, 4, 3, 1};
        System.out.println(q121.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice)
                minPrice = prices[i];
            maxProfit = Math.max(prices[i] - minPrice, maxProfit);

        }
        return maxProfit;
    }
}
