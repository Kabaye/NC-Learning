package edu.netcracker.small_learning_things.interviewbit.maximum_sub_array;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public ArrayList<Integer> maxset(ArrayList<Integer> A) {
        int start = 0;
        long currSum = 0;
        int maxStart = 0;
        int maxEnd = 0;
        long maxSum = -1;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) >= 0) {
                currSum += A.get(i);
            } else {
                if (currSum > maxSum) {
                    maxSum = currSum;
                    maxStart = start;
                    maxEnd = i;
                }
                start = i + 1;
                currSum = 0;
            }
        }

        if (currSum > maxSum) {
            maxStart = start;
            maxEnd = A.size();
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = maxStart; i < maxEnd; i++) {
            result.add(A.get(i));
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        ArrayList<Integer> result = solution.maxset(new ArrayList<>(List.of(1967513926, 1540383426, -1303455736, -521595368)));
        System.out.println(result);
    }
}

