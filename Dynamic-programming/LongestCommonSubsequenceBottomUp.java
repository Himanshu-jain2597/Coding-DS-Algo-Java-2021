class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int r=text1.length();
        int c=text2.length();
        int dp[][] = new int[r+1][c+1];
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(text2.charAt(j-1)==text1.charAt(i-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[r][c];
    }
}
