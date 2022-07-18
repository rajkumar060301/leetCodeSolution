package easyLevel;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 18 version
 * Date: 18-Jul-22
 */

import java.util.ArrayList;
import java.util.List;

public class Q1431 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            max = Math.max(max, candies[i]);

        }
        for (int i = 0; i < candies.length; i++) {
            int sum = candies[i] + extraCandies;
            if (sum >= max) {
                list.add(true);

            } else {
                list.add(false);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int extra = 3;
        int[] arr = new int[]{2, 3, 5, 1, 3};
        Q1431 obj = new Q1431();
        System.out.println(obj.kidsWithCandies(arr, extra));


    }
}

