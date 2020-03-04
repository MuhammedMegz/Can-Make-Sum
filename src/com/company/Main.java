package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	    int[] nums = new int[]{1,2,5,6,8};
	    CanMakeSum canMakeSum = new CanMakeSum();

        System.out.println(CanMakeSum.canMakeTarget(nums, 6));

    }


}
