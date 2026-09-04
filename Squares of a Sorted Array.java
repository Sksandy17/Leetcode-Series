class Solution {
    public int[] sortedSquares(int[] nums) {
        int sq[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            sq[i] = nums[i]*nums[i]; 
        }
        for(int i=0; i<sq.length-1; i++){
            for(int j=i; j<sq.length; j++){
                if(sq[i]>sq[j]){
                    int temp = sq[i];
                    sq[i] = sq[j];
                    sq[j] = temp;
                }
            }
        }
        return sq;
    }
}
