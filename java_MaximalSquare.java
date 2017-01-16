import java.util.*;
class Solution {
    public int populate(int[][] dp,int i,int j){
        if ((i-1)<0 || (j-1)<0) return 1;
        int west= dp[i][j-1];
        int north= dp[i-1][j];
        int nw= dp[i-1][j-1];
        return Math.min(nw, Math.min(west, north))+1;
    }

    public int maximalSquare(String[] matrix) {
      int rows= matrix.length;
      if (rows==0) return 0;
      int cols= matrix[0].length();

      int Max= 0;
      int[][] dp= new int[rows][cols];
      for(int[] row: dp) Arrays.fill(row,0);
      for (int i=0;i<rows; i++) {
        for (int j=0;j<cols; j++) {
          if (matrix[i].charAt(j)=='1') {
            dp[i][j]=populate(dp,i,j);
            Max= Math.max(Max, dp[i][j]);
          }
        }
      }
      return Max*Max;
    }
}
class java_MaximalSquare{
    public static void main(String args[]) {
      String[] matrix= {"1111","1101","0011"};
      Solution obj= new Solution();
      int largestAreaOfSqr= obj.maximalSquare(matrix);
      System.out.println(largestAreaOfSqr);
    }
}
