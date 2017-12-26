package com.newble.lib;

/**
 * LeetCode question 1
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * 汉语描述:给定一个int类型数组和一个int类型target数值,求数组中两个数相加后的数值==target时,这两个数的索引组成的int数组.
 * <p>
 * 下面的算法的时间复杂度:O(n^2)
 * 空间复杂度:O(1)
 */
public class myClass {
    //psvm
    public static void main(String[] args) {
        System.out.println("哈哈哈哈哈哈哈哈哈哈哈哈");
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        new myClass().twoSum(nums, target);

    }


    public int[] twoSum(int[] nums, int target) {

        int indexA = -1, indexB = -1;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indexA = i;
                    indexB = j;
                    break;
                }
            }
        }
        if (indexA != -1 && indexB != -1) {
            return new int[]{indexA, indexB};
        } else {
            return new int[]{0};
        }
    }
}
