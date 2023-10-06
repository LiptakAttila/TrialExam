package com.gfa.exam.Symmetric;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SymmetricMatrixTest {

    @Test
    void isSymmetricTestNegativeInputNumberErrorHandling() {
        SymmetricMatrix isMatrixSymmetricFunc = new SymmetricMatrix();
        assertThrows(IllegalArgumentException.class, () -> {
            isMatrixSymmetricFunc.isSymmetric(-2);
        });
    }
    @Test
    void isSymmetricTestResult() {
        SymmetricMatrix isMatrixSymmetricFunc = new SymmetricMatrix();
        assertEquals(true, isMatrixSymmetricFunc.isSymmetric(3));
    }
}