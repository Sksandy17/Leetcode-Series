class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        find(candidates, target, 0, cur, result);
        return result;
    }
    public void find(int[] candidates, int target, int index,
                     List<Integer> cur, List<List<Integer>> result){
        if(target==0){
            result.add(new ArrayList<>(cur));
            return;
        }
        if(target<0 || index==candidates.length) {
            return;
        }
        cur.add(candidates[index]);
        find(candidates, target - candidates[index],
             index, cur, result);
        cur.remove(cur.size()-1);
        find(candidates, target, index + 1,
             cur, result);
    }
}
