package practice;

import java.util.Arrays;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fibo(10)));
    }
//    public static int fibo(int n){
//        if(n<=1){
//            return n;
//        }
//        return fibo(n-1)+fibo(n-2);
//    }
    public static int[] fibo(int n){
        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for (int i = 2; i < dp.length; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp;
    }
}
