class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean[] dp = new Boolean[s.length()];
        
        Boolean status = solve(s,wordDict,0,dp);

        if(status != null){
            return status;
        }

        return false;
    }

    public boolean solve(String s, List<String> wordDict,int idx,Boolean[] dp){
        if(idx == s.length()) return true;

        if(dp[idx] != null){
            return dp[idx];
        }

        for(String str : wordDict){
            if(idx + str.length() <= s.length() && s.substring(idx,idx + str.length()).equals(str)){
                if(solve(s,wordDict,idx+str.length(),dp)){
                    dp[idx] = true;
                    return true;
                }
            }
        }

        dp[idx] = false;
        return dp[idx];
    }
}
