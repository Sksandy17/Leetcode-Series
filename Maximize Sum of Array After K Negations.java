class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        while(k>0){
            int index = 0;
            for(int i=1; i<nums.length; i++){
                if(nums[i]<nums[index])
                    index = i;
            }
            nums[index] = -nums[index];
            k--;
        }
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }
        return sum;
    }
}
