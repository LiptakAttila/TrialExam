package com.gfa.exam.Symmetric;

import java.util.Arrays;

public class SymmetricMatrix {

    public boolean isSymmetric(int[][] matrix) {

//        if (n<0) {
//            throw new IllegalArgumentException("Input number can't be negative number.");
//        }
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
