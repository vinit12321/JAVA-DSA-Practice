package com.leetcode.arrays;

public class oddCells_brute {
    public static void main(String[] args) {

        int[][] indices = {{0, 1}, {1, 1}};
        //System.out.println(Arrays.toString(indices));
        System.out.println(oddCells1(2, 3, indices));
    }

    static int oddCells1(int m, int n, int[][] indices) {
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        for (int i = 0; i < indices.length; i++) {
            row[indices[i][0]] ^= true;
            col[indices[i][1]] ^= true;
        }
        int r = 0;
        int c = 0;
        for (int i = 0; i < m; i++) {
            if (row[i]) {
                r++;
            }
        }
        for (int j = 0; j < n; j++) {
            if (col[j]) {
                c++;
            }
        }
        return r * n + c * m - 2 * r * c;
    }
}
