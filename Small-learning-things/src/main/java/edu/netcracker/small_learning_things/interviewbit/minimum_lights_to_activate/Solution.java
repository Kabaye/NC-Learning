package edu.netcracker.small_learning_things.interviewbit.minimum_lights_to_activate;

/*
There is a corridor in a Jail which is N units long. Given an array A of size N.
The ith index of this array is 0 if the light at ith position is faulty otherwise it is 1.

All the lights are of specific power B which if is placed at position X, it can light the corridor from [ X-B+1, X+B-1].

Initially all lights are off.

Return the minimum number of lights to be turned ON to light the whole corridor or -1 if the whole corridor cannot be lighted.
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int count = 0;
        for (int i = 0; i < A.size(); ) {
            boolean found = false;
            for (int j = Math.min(i + B - 1, A.size() - 1); j >= Math.max(i - B + 1, 0); j--) {
                if (A.get(j) == 1) {
                    count++;
                    i = j + B;
                    found = true;
                    break;
                }
            }
            if (!found) {
                return -1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int solve = solution.solve(new ArrayList<>(List.of(0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 0)), 12);
        System.out.println(solve);
    }

}

