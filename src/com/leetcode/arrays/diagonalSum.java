package com.leetcode.arrays;

public class diagonalSum {
    public static void main(String[] args) {
        //int mat[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //int mat[][] = {{5}};
        int mat[][]= {{1,1,1,1},
              {1,1,1,1},
              {1,1,1,1},
              {1,1,1,1}};
        System.out.println(diagonalSum(mat));

    }

    static int diagonalSum(int[][] mat) {
        int length = mat.length;
        int sum = 0;
        if (length == 1) {
            return mat[0][0];
        } else {
            for (int i = 0; i < mat.length; i++) {
                sum += mat[i][i];
            }
            if (length % 2 == 0) {
                for (int i = 0, j = mat.length - 1; i < mat.length && j >= 0; i++, j--) {
                    sum += mat[i][j];
                }
            } else {
                for (int i = 0, j = mat.length - 1; i < mat.length && j >= 0; i++, j--) {
                    int mid_value = Math.floorDiv(mat.length, 2);
                    if (mid_value != i && mid_value != j) {
                        sum += mat[i][j];
                    }

                }
            }


        }
        return sum;
    }

}
