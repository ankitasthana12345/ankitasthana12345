package com.hashMap.String;

public class PermutationAinB {

  public int solve(String A,String B){
      int n = A.length();
      int m = B.length();
      int hash1[] = new int[26];
      int hash2[] = new int[26];
      int count=0;
      // count frequency of each char in A
      for(int i=0;i<n;i+=1){
          hash1[A.charAt(i)-'a'] +=1;
      }
      // count frequency of each char in first window of size n in B
      for(int i=0;i<n;i+=1){
          hash2[B.charAt(i)-'a'] +=1;
      }
      count += same(hash1, hash2);
      // move current window 1 step ahead

      for(int i=n,j=0;i<m;i+=1,j+=1){
        hash2[B.charAt(j) -'a'] -=1;
        hash2[B.charAt(i) -'a'] +=1;
        count +=same(hash1,hash2);
      }

    return count;
  }


    public int same(int hash1[],int hash2[]){
        for(int i=0;i<26;i++){
            if(hash1[i]!=hash2[i]) return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        String a="abc";
        String b="abcbacabc";
        PermutationAinB pr = new PermutationAinB();
        int ans = pr.solve(a,b);
        System.out.println(ans);
    }
}
