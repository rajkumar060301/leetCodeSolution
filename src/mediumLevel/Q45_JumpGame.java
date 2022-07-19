package mediumLevel;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 18 version
 * Date: 19-Jul-22
 */

import java.util.Arrays;

public class Q45_JumpGame {
    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 1, 1, 4};
        Q45_JumpGame obj = new Q45_JumpGame();
        System.out.println(obj.jump(array));

    }

    public int jump(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MIN_VALUE);
        dp[n - 1] = 0;
        for (int i = n - 2; i >= 0; i--) {
            int min = Integer.MAX_VALUE;
            for (int j = i + 1; j <= Math.min(n - 1, i + nums[i]); j++) {
                min = Math.min(min, dp[j]);
            }
            if (min != Integer.MAX_VALUE) {
                dp[i] = min + 1;

            }


        }
        return dp[0];

    }
}
