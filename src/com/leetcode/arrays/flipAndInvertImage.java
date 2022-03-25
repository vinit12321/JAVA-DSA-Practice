package com.leetcode.arrays;

import java.util.Arrays;

public class flipAndInvertImage {
    public static void main(String[] args) {
        int image[][] = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        for (int[] i : flipAndInvertImage(image)) {
            System.out.println(Arrays.toString(i));
        }
    /*
    First Step is to reverse each array.
    Second step is flip array using i^=1 bitwise operator
    Third Step is to return final array

     */
    }

    static int[] reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {

            int j = array[i];

            array[i] = array[array.length - i - 1];

            array[array.length - i - 1] = j;

        }
        return array;
    }

    static int[][] flipAndInvertImage(int[][] image) {
        int[][] flipimage = new int[image.length][image[0].length];
        for (int i = 0; i < image.length; i++) {
            int[] revarr = reverse(image[i]);
            for (int j = 0; j < revarr.length; j++) {
                flipimage[i][j] = revarr[j] ^= 1;
            }
        }


        return flipimage;
    }
}
