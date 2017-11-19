/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codilitymaster.arrays;

/**
 *
 * @author icode
 */
class MultidimensionalArray {

    public static void main(String[] args) {

        twoDimensionalArray();
        threeDimesionalArray();
    }

    public static int[][] twoDimensionalArray() {
        int[][] twoDimArray = {
            {1, -2, 3},
            {-4, -5, 6, 9},
            {7},};

        System.out.println(" TWO DIMENSIONAL ARRAY RESULTS \n");

        for (int i = 0; i < twoDimArray.length; ++i) {
            for (int j = 0; j < twoDimArray[i].length; ++j) {
                System.out.println(twoDimArray[i][j]);
            }
        }

        return twoDimArray;

    }

    public static int[][][] threeDimesionalArray() {

        // test is a 3d array
        int[][][] threeDimArray = {
            {
                {1, -2, 3},
                {2, 3, 4}
            },
            {
                {-4, -5, 6, 9},
                {1},
                {2, 3}
            }
        };
        System.out.println(" THREE DIMENSIONAL ARRAY RESULTS \n");

        // for..each loop to iterate through elements of 3d array
        for (int[][] array2D : threeDimArray) {
            for (int[] array1D : array2D) {
                for (int item : array1D) {
                    System.out.println( item);
                }
            }
        }

        return threeDimArray;
    }
}
