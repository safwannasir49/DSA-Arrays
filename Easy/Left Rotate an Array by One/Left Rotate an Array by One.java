import java.util.*;  
import java.io.*;  

class Solution {  
    public static int[] rotateArray(int[] nums, int n) {  
        if (n == 0 || nums.length == 0) return nums;  

        int k = nums[0];  
        for (int i = 1; i < n; i++) {  
            nums[i - 1] = nums[i];  
        }  
        nums[n - 1] = k;  

        return nums;  
    }  

    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        int n = sc.nextInt();  
        int[] nums = new int[n];  

        for (int i = 0; i < n; i++) {  
            nums[i] = sc.nextInt();
        }  

        nums = rotateArray(nums, n);  

        for (int num : nums) {  
            System.out.print(num + " ");  
        }  
        sc.close();  
    }  
}
