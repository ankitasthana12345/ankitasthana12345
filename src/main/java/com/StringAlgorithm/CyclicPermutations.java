package com.StringAlgorithm;

public class CyclicPermutations {

    private static void create_Zarr(String str, int[] Z) {

        int n = str.length();

        // [left,right] make a window which matches with
        // prefix of s
        int left = 0, right = 0;

        for(int i = 1; i < n-1; ++i) {

            // if i>right nothing matches so we will calculate.
            // Z[i] using naive way.
            if(i > right){

                left = right = i;

                while(right < n && str.charAt(right - left) == str.charAt(right))
                    right++;
                Z[i] = right - left;
                right--;

            }
            else{

                // k = i-left so k corresponds to number which
                // matches in [left,right] interval.
                int k = i - left;


                if(Z[k] < right - i + 1)
                    Z[i] = Z[k];


                else{
                    // else start from right and check manually
                    left = i;
                    while(right < n && str.charAt(right - left) == str.charAt(right))
                        right++;

                    Z[i] = right - left;
                    right--;
                }
            }
        }
    }

    public static int solve(String A, String B) {
        B=B+B;
        B=B.substring(0,B.length()-1);
        int ans =0;
        String s = A+'$'+B;
        int n = s.length();
        int z[] = new int [n];
         create_Zarr(s,z);
        for(int i=1;i<=n-1;i++){
            if(z[i]==A.length()) ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        String A="1101111111";
        String B="1101111111";
        int ans = solve(A,B);
        System.out.println(ans);
    }
}
