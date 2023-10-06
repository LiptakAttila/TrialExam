package com.gfa.exam.Symmetric;

import java.util.Arrays;

public class SymmetricMatrix {

    public boolean isSymmetric(int n) {
        if (n<0) {
            throw new IllegalArgumentException("Input number can't be negative number.");
        }

        int[][] multiMatrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (multiMatrix[i][j] != multiMatrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
