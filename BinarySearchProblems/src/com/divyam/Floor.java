package com.divyam;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = floor(arr,target);
        System.out.println(ans);
    }

    static int floor(int[] arr, int target){
        if (target == arr[arr.length - 1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            //find the middle element
            int middle = start + (end - start) / 2;

            if (target < arr[middle]){
                end = middle - 1;
            } else if (target > arr[middle]) {
                start = middle + 1;
            }else{
                //ans found
                return middle;
            }
        }
        return end;
    }

    public static class ssinarysearch {
        public static void main(String[] args){
            int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
            int target =22;
            int ans = binarySearch(arr,target);
            System.out.println(ans);
        }

        //return the index
        //return -1 if it not exist
        static int binarySearch(int[] arr, int target){
            int start = 0;
            int end = arr.length-1;

            while(start <= end){
                //find the middle element
                int middle = start + (end - start) / 2;

                if (target < arr[middle]){
                    end = middle - 1;
                } else if (target > arr[middle]) {
                    start = middle + 1;
                }else{
                    //ans found
                    return middle;
                }
            }
            return -1;
        }
    }
}