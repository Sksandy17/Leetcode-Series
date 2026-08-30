class Solution {
    public int thirdMax(int[] nums) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]<nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        int k = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]!=nums[i-1]){
                nums[k] = nums[i];
                k++;
            }
        }
        if(k>=3)
            return nums[2];
        return nums[0];
    }
}
