package edu.netcracker.small_learning_things.interviewbit.min_steps_in_infinite_grid;

import java.util.ArrayList;

public class Solution {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() == 1) {
            return 0;
        }
        if (A.size() == 2) {
            return Math.max(Math.abs(A.get(1) - A.get(0)), Math.abs(B.get(1) - B.get(0)));
        }
        int total = 0;
        for (int i = 1; i < A.size(); i++) {
            total += Math.max(Math.abs(A.get(i) - A.get(i - 1)), Math.abs(B.get(i) - B.get(i - 1)));
        }

        return total;
    }
}
