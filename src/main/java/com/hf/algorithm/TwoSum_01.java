package com.hf.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.cn/problems/two-sum/
 * <p>
 * date : 2022/7/31
 * time : 16:45
 * </p>
 * @author huangfu
 */
public class TwoSum_01 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> tempMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (tempMap.get(target - nums[i]) != null){
                return new int[]{i, tempMap.get(target - nums[i])};
            }
            tempMap.put(nums[i],i);
        }
        return new int[]{};
    }
}
