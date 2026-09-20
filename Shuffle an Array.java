class Solution {
    int[] original;
    public Solution(int[] nums) {
        original = nums.clone();
    }
    
    public int[] reset() {
        return original.clone();
    }
    
    public int[] shuffle() {
        int[] a = original.clone();
        for(int i=0; i<a.length; i++){
            int j = (int)(Math.random()*a.length);
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        return a;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
