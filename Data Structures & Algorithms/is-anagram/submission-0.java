class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char currChar = s.charAt(i);
            map.put(currChar,map.getOrDefault(currChar,0)+1);
        }

        for(int i = 0; i < t.length(); i++){
            char currChar = t.charAt(i);
            if(map.containsKey(currChar)){
                map.put(currChar,map.get(currChar)-1);
            }else{
                return false;
            }
        }

        for(int i : map.values()){
            if(i != 0){
                return false;
            }
        }

        return true;
    }
}
