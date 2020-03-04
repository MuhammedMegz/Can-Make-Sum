package com.company;

import java.util.HashSet;
import java.util.Set;

public class CanMakeSum {

    public static boolean canMakeTarget(int[] nums, int target){
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums){
            if (numSet.contains(num))
                return true;
            numSet.add(target - num);
        }
        return false;
    }
}
