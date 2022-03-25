package com.leetcode.arrays;

import java.util.Arrays;

public class Transpose_Matrix {
    public static void main(String[] args) {
    int matrix[][] = {{1,2,3},{4,5,6}};
    // [[1,4],[2,5],[3,6]]
    for(int ar[]:transpose(matrix)){
        System.out.println(Arrays.toString(ar));
    }

    }
    static int[][] transpose(int[][] matrix) {
        int transpose[][]=new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
    return transpose;
    }
}
