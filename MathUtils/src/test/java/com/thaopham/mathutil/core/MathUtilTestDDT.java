package com.thaopham.mathutil.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;


class MathUtilTestDDT {

   // Bảng dữ liệu: các bộ đầu vào kiểm thử và kết quả mong đợi tương ứng
    // Mỗi phần tử trong mảng gồm {n, expected}
    public static Object[][] initData() {
        return new Object[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {5, 120},
            {6, 720}
        };
    }

    @ParameterizedTest
    @MethodSource("initData") // nạp dữ liệu kiểm thử từ initData
    public void testGetFactorialGivenRightArgumentReturnsWell(int input, long expected) {
        assertEquals(expected, MathUtil.getFactorial(input));
    }

    @Test
    public void testGetFactorialGivenWrongArgumentThrowException() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> MathUtil.getFactorial(-5)
        );
        assertEquals("n must be between 0 and 20.", exception.getMessage());
    }
}
