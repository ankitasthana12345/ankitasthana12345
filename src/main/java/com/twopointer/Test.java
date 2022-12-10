package com.twopointer;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int arr[]={1,3,2,4,5,6,5,6};

        Arrays.sort(arr);

        for (int i=0;i<arr.length-1;i++){
            int freq =1;
            if(arr[i]==arr[i+1]){
                freq=freq+1;
                System.out.println(arr[i]+" "+ freq);
            }
            if(freq>1 && arr[i]==arr[i+1]) {
                     freq=1;
            }
            System.out.println(freq);

        }
    }
}
