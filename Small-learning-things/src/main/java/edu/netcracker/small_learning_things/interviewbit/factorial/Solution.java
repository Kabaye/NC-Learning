package edu.netcracker.small_learning_things.interviewbit.factorial;

import java.math.BigDecimal;

public class Solution {
    public String solve(int a) {
        if (a == 0) {
            return "1";
        }
        if (a == 1) {
            return "1";
        }

        if (a == 2) {
            return "2";
        }

        if (a == 3) {
            return "6";
        }

        BigDecimal result = BigDecimal.valueOf(6L);
        int x = 4;
        while (x <= a) {
            result = result.multiply(BigDecimal.valueOf(x++));
        }

        return result.toPlainString();
    }
}
