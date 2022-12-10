package com.StringAlgorithm;

public class ZAlgorithm {

    // Fills Z array for given string str[]
    private static void create_Zarr(String str, int[] Z) {

        int n = str.length();

        // [left,right] make a window which matches with
        // prefix of s
        int left = 0, right = 0;

        for(int i = 1; i < n; ++i) {

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

    public static void find(String text,String pattern){
        String concat = pattern+'$'+text;
        int l = concat.length();
        int z [] = new int[l];
        create_Zarr(concat,z);
        // now looping through Z array for matching condition
        for(int i = 0; i < l; i++){

            // if Z[i] (matched region) is equal to pattern
            // length we got the pattern

            if(z[i] == pattern.length()){
                System.out.println("Pattern found at index "
                        + (i - pattern.length() - 1));
            }
        }
    }
    public static void main(String[] args) {

        String text = "faabbcdeffghiaaabbcdfgaabf";
        String pattern = "aabb";

        find(text, pattern);

    }
}
