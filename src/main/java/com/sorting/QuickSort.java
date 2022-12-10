package com.sorting;

public class QuickSort {

    int rearrange(int []arr,int l,int r){
        int p1 =l+1; int p2=r;

        while(p1<=p2){
            if(arr[p1]<arr[l]){
                p1++;
            }else if(arr[p2] >arr[l]){
                p2--;
            }else{
                int temp = arr[p1];
                arr[p1]=arr[p2];
                arr[p2] =temp;
            }
        }

        int temp = arr[l];
        arr[l]=arr[p1-1];
        arr[p1-1] =temp;

        return p1-1;
    }

    public void quicksort(int[] arr, int l, int r){
        if(l>=r) return;
       int idx=rearrange(arr,l,r);
        quicksort(arr,l,idx-1);
        quicksort(arr,idx+1,r);
    }

    void printArray(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {

        int arr[] = { 4,3,7,1,5 };
        QuickSort qs = new QuickSort();
        qs.quicksort(arr,0,arr.length-1);
        System.out.println("Sorted array");
        qs.printArray(arr);

    }

}
