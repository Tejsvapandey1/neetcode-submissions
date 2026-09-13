class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        maxFreq = 0
        freq = {}
        result = 0
        left = 0

        for right in range(len(s)):
            freq[s[right]] = freq.get(s[right],0) + 1
            maxFreq = max(freq[s[right]],maxFreq)

            length = right - left + 1

            if (length - maxFreq) > k:
                freq[s[left]] -= 1
                left += 1
            result = max(result, right - left + 1)

        return result
        