class Solution {
    public String sortString(String str){
        char[] charStr = str.toCharArray();
        Arrays.sort(charStr);

        return new String(charStr);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            String sortedStr = sortString(str);
            System.out.print(sortedStr + " ");
            map.putIfAbsent(sortedStr, new ArrayList<>());
            map.get(sortedStr).add(str);
        }

        for(Map.Entry<String,List<String>> entry : map.entrySet()){
            res.add(entry.getValue());
        }

        return res;
    }
}
