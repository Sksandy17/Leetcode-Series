class Solution {
    public int threeSumClosest(int[] nums, int target) {
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        int cl = nums[0]+nums[1]+nums[2];
        for(int i=0; i<nums.length-2; i++){
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==target)
                    return sum;
                if(sum<target)
                    left++;
                else
                    right--;
                if(Math.abs(sum-target)<Math.abs(cl-target))
                    cl = sum;
            }
        }
        return cl;
    }
}
