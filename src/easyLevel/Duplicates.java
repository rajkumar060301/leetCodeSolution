package easyLevel;
/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 17 version
 * Date: 08-Mar-22
 */

import java.util.HashSet;
import java.util.Set;

public class Duplicates {

    public static void main(String[] args) {
        Duplicates duplicates = new Duplicates();
        int[] nums = new int[]{14, 78, 14, 5, 5, 1, 8, 78, 78};
        System.out.println(duplicates.removeDuplicates(nums));

    }

    public Set<Integer> removeDuplicates(int[] nums) {
        Set<Integer> duplicates = new HashSet<Integer>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    duplicates.add(nums[j]);
                    break;
                }
            }
        }
        System.out.println(duplicates.stream().count());
        return duplicates;

    }
}
