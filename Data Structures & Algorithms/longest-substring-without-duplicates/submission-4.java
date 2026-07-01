class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int maxLen = Integer.MIN_VALUE;
        char[] str = s.toCharArray();
        int left = 0;
        for(int right = 0; right < s.length(); right++){
            char currChar = str[right];

            if(map.containsKey(currChar) && map.get(currChar) >= left){
                
                left = map.get(currChar) + 1;
            }
            
            map.put(currChar,right);
            maxLen = Math.max(maxLen,right - left + 1);
        }

        if(maxLen == Integer.MIN_VALUE) maxLen = 0;

        return maxLen;
    }
}
