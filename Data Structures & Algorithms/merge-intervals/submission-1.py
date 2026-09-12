class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort()
        result = []

        for current in intervals:
            if not result or current[0] > result[-1][1]:
                result.append(current)
            else:
                result[-1][1] = max(current[1],result[-1][1])
        

        return result
        