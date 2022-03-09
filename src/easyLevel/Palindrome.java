package easyLevel;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 17 version
 * Date: 09-Mar-22
 */

public class Palindrome {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        int x = 121;
        System.out.println(palindrome.isPalindrome(x));

    }

    public boolean isPalindrome(int x) {
        int temp, r;
        int sum = 0;
        temp = x;
        while (x > 0) {
            r = x % 10;
            sum = (sum * 10) + r;
            x = x / 10;
        }
        boolean response = false;
        if (temp == sum) {
            response = true;
        }
        return response;
    }
}
