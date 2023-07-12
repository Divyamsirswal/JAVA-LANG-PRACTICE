package com.divyam;

public class orderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target =22;
        int ans = orderAgnostic(arr,target);
        System.out.println(ans);
    }

    static int orderAgnostic(int[] arr, int target){
        int s=0;
        int e= arr.length -1;

        boolean isAsc = arr[s]<arr[e];

        while(s <= e){
            //find the middle element
            int middle = s + (e - s) / 2;

            if (arr[middle]==target){
                return middle;
            }

            if (isAsc){
                if (target < arr[middle]){
                    e = middle - 1;
                } else {
                    s = middle + 1;
                }
            }else{
                if (target > arr[middle]){
                    e = middle - 1;
                } else{
                    s = middle + 1;
                }
            }

        }
        return -1;
    }
}
