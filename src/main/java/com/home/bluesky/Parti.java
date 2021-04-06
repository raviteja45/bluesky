class Solution {
    public List<Integer> partitionLabels(String S) {
        int start = 0;
        int end = 0;
        List<Integer> res = new ArrayList<>();
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<S.length();i++){
            map.put(S.charAt(i),S.lastIndexOf(S.charAt(i)));
        }
        for(int i=0;i<S.length();i++){
            int last = map.get(S.charAt(i));
            end  = Math.max(end,last);
            if(i==end){
                res.add(end-start+1);
                start = i+1;
            }
        }
        return res;
    }
}
