package com.hf.algorithm;

/**
 * https://leetcode.cn/problems/container-with-most-water/
 * <p>
 * date : 2022/7/31
 * time : 16:54
 * </p>
 * @author huangfu
 */
public class MaxArea_11 {

    public int maxArea(int[] height) {

        int maxA = 0;
        int lf = 0;
        int rg = height.length - 1;
        while (rg > lf){
            maxA = Math.max(maxA, Math.min(height[rg],height[lf]) * (rg - lf));
            if (height[rg] > height[lf]){
                lf++;
            }else {
                rg--;
            }
        }
        return maxA;
    }
}
