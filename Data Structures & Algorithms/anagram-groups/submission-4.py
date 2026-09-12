class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        count = {}

        for word in strs:
            sortedWord = ''.join(sorted(word))

            if sortedWord not in count:
                count[sortedWord] = []
            
            count[sortedWord].append(word)

        return list(count.values())