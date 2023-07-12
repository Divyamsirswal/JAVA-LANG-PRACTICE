package com.divyam;

public class firstAndLastPosition {
    public static void main(String[] args) {

    }

    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};
        int start =search(nums,target,true);
        int end = search(nums,target,false);

        ans[0]= search(nums,target,true);
        if(ans[0]!=-1) {
            ans[1] = search(nums, target, false);
        }

        return ans;
    }

    int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            //find the middle element
            int middle = start + (end - start) / 2;

            if (target < nums[middle]) {
                end = middle - 1;
            } else if (target > nums[middle]) {
                start = middle + 1;
            } else {
                //ans found
                ans=middle;
                if (findStartIndex){
                    end=middle-1;
                }else {
                    start = middle+1;
                }
            }

        }
        return ans;
    }
}