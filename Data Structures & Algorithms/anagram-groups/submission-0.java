class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            char[] currStrArr = strs[i].toCharArray();
            Arrays.sort(currStrArr);
            String key = new String(currStrArr);

            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(strs[i]);
        }

        return new ArrayList<>(map.values());
    }
}
