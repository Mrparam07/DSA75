package Arrays.TwoSum;

import java.util.Arrays;

public class TwoPointerTwoSum {

    public static void main(String[] args) {
        System.out.println(getSum(new int[]{1,-7,3,5,8,2,7}, 15));
    }

    private static boolean getSum(int[] arr, int target) {
        Arrays.sort(arr);
        int j = arr.length-1;
        int i =0;
        while(i<j){
            int sum = arr[i] + arr[j];
            if( sum == target) {
                return true;
            } else if(sum>target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }

}
