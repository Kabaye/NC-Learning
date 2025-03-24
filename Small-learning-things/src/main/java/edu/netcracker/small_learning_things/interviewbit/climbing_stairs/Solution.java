package edu.netcracker.small_learning_things.interviewbit.climbing_stairs;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solve(ArrayList<Integer> A) {
        List<Integer> costs = new ArrayList<>(A.size());
        costs.add(A.get(0));
        if (A.size() > 1) {
            costs.add(A.get(0) + A.get(1));
        }
        if (A.size() > 2) {
            costs.add(Math.min(A.get(0) + A.get(2), costs.get(1) + A.get(2)));
        }
        if (A.size() > 3) {
            for (int i = 3; i < A.size(); i++) {
                costs.add(Math.min(costs.get(i - 2) + A.get(i), costs.get(i - 1) + A.get(i)));
            }
        }

        return costs.get(costs.size() - 1);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solve(new ArrayList<>(List.of(27, 79, 46, 35, 46, 81, 94, 66, 22, 68, 91, 26, 87, 48, 51, 61, 82, 76, 47, 96, 64, 44, 83, 69, 71, 99, 96, 86))));
    }
}
