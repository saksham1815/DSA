import java.util.ArrayList;
import java.util.*;

class Solution {
    public static long nCr(int n, int r) {
        long res = 1;

        // Calculating nCr:
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }

    public static int pascalTriangle(int r, int c) {
        return (int) nCr(r - 1, c - 1);
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        // Generating Pascal's Triangle:
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                row.add((int) nCr(i, j));
            }
            triangle.add(row);
        }
        return triangle;
    }
}
