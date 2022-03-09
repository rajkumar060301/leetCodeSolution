package mediumLevel;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 17 version
 * Date: 08-Mar-22
 */

public class Q50_Power {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        Q50_Power power = new Q50_Power();
        double x = 2.00000;
        int n = -2;
        System.out.println(power.pow(x, n));

    }

    public double pow(double x, int n) {
        double res;
        if (n < 0) {
            res = 1 / Math.pow(n, x);
        } else {
            res = Math.pow(n, x);
        }
        return Math.abs(res);

    }
}
