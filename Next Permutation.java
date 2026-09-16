class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            int j = nums.length-1;
            while(nums[i]>=nums[j]){
                j--;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        int l = i+1;
        int r = nums.length-1;
        while(l<r){
            int temp1 = nums[l];
            nums[l] = nums[r];
            nums[r] = temp1;
            l++;
            r--;
        }
    }
}
