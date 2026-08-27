class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] result = new int[1000];
        int k = 0;
        for(int i=0; i<nums1.length; i++) {
            boolean found = false;
            for(int j=0; j<nums2.length; j++) {
                if(nums1[i]==nums2[j]) {
                    found = true;
                    break;
                }
            }
            if(found) {
                boolean duplicate = false;
                for(int j=0; j<k; j++) {
                    if(result[j]==nums1[i]) {
                        duplicate = true;
                        break;
                    }
                }
                if(!duplicate) {
                    result[k] = nums1[i];
                    k++;
                }
            }
        }
        int[] ans = new int[k];
        for(int i=0; i<k; i++) {
            ans[i] = result[i];
        }
        return ans;
    }
}
