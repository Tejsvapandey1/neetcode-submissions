class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        rowLen = len(board)
        colLen = len(board[0])

        def backtrack(r,c,idx):

            if(idx == len(word)):
                return True
            
            if(r < 0 or r >= rowLen or c < 0 or c >= colLen):
                return False
            
            if(board[r][c] != word[idx]):
                return False

            temp = board[r][c]
            board[r][c] = "#"

            found = (
                backtrack(r-1,c,idx + 1) or
                backtrack(r+1,c,idx+1) or
                backtrack(r,c-1,idx+1) or
                backtrack(r,c+1,idx+1)
            )

            board[r][c] = temp
            return found

        for r in range (rowLen):
            for c in range (colLen):
                if backtrack(r,c,0):
                    return True
        
        return False