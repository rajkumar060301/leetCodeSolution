package easyLevel;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 17 version
 * Date: 21-Feb-22
 */

import java.util.HashMap;

public class Q1_SumProblem {

    public int[] twoSum(int[] nums, int target) {

        //I solve this problem with hashing technique
        HashMap<Integer, Integer> map = new HashMap();

        // fill in HashMap
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);

        }

        //Searching
        for (int j = 0; j < nums.length; j++) {
            int num = nums[j];
            int remainingDigit = target - num;
            if (map.containsKey(remainingDigit)) {
                int index = map.get(remainingDigit);
                if (index == j)
                    continue;
                return new int[]{j, index};
            }
        }

        return new int[]{};

    }

    public static void main(String[] args) {
        Q1_SumProblem q1_sumProblem = new Q1_SumProblem();
        int[] nums = new int[]{3, 2, 4};
        int target = 6;
        System.out.println(q1_sumProblem.twoSum(nums, target));
    }

}
