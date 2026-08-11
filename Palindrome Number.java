class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0, m = x;
        while(x>0){
            int r = x%10;
            rev = rev*10+r;
            x /= 10;
        }
        if(m==rev)
            return true;
        else
            return false;
    }
}
