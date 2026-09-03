class Solution {
    public int heightChecker(int[] heights) {
        int[] expect = heights.clone();
        for(int i=0; i<expect.length-1; i++){
            for(int j=i+1; j<expect.length; j++){
                if(expect[i]>expect[j]){
                    int temp = expect[i];
                    expect[i] = expect[j];
                    expect[j] = temp;
                }
            }
        }
        int count = 0;
        for(int i=0; i<heights.length; i++){
            if(heights[i] != expect[i]){
                count++;
            }
        }
        return count;
    }
}
