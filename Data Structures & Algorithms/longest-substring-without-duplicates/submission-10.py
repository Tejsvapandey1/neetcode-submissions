class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        chars = set()
        left = 0
        maxLen = 0;
        n = len(s)

        for right in range(0,n,1):
            while s[right] in chars:
                chars.remove(s[left])
                left += 1

            chars.add(s[right])
            maxLen = max(maxLen,right-left+1)
        
        return maxLen