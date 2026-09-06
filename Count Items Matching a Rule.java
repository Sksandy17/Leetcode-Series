class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for(int i=0; i<items.size(); i++){
            String value = "";
            if(ruleKey.equals("type")){
                value = items.get(i).get(0);
            }
            else if(ruleKey.equals("color")){
                value = items.get(i).get(1);
            }
            else{
                value = items.get(i).get(2);
            }
            if(value.equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}
