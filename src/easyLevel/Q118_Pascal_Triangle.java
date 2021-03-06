package easyLevel;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 18 version
 * Date: 20-Jul-22
 */

import java.util.ArrayList;
import java.util.List;

public class Q118_Pascal_Triangle {
    public static void main(String[] args) {
        Q118_Pascal_Triangle obj = new Q118_Pascal_Triangle();
        System.out.println(obj.generate(1));

    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        if (numRows == 0) {
            return triangle;
        }
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);
        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> preRow = triangle.get(rowNum - 1);
            row.add(1);
            for (int j = 1; j < rowNum; j++) {
                row.add(preRow.get(j - 1) + preRow.get(j));

            }
            row.add(1);
            triangle.add(row);
        }
        return triangle;

    }
}
