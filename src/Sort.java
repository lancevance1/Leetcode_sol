import java.util.Arrays;
import java.util.Random;

public class Sort {
    //average TC: O(nlogn) SC:O(1)
    public void quicksort(int[] arr, int i, int j){
        if(i<j){
            int mid = partition(arr,i,j);
            quicksort(arr,i,mid-1);
            quicksort(arr,mid+1,j);
        }
    }

    private int partition(int[] arr, int i, int j){
        Random random = new Random();
        int pivot = random.nextInt(j - i + 1) + i; //随机化版
        swap(arr,j,pivot);
        pivot=arr[j]; //算法导论版

        int left = i-1; //left 为小于pivot的子数组的最大index
        for (int k = i; k < j; k++) { // k 为遍历数组
            if (arr[k]<=pivot){
                left++;
                swap(arr,left,k);
            }
        }
        swap(arr,j,left+1);
        return left+1;
    }

    private void swap(int[] arr, int i, int j){
        int tmp = arr[j];
        arr[j]=arr[i];
        arr[i]=tmp;
    }

    //soln2: mergesort recusive version, tc: O(nlogn), sc: O(n) additional space complexity
    public void mergeSort(int[]arr, int num1, int num2){
        if (num1<num2){
            int pivot = num1+((num2-num1)>>1);
            mergeSort(arr,num1,pivot);
            mergeSort(arr,pivot+1,num2);
            merge(arr,num1,pivot,num2);
        }

    }

    private void merge(int[] arr, int i, int j, int k){

        int[] arr1 = new int[j-i+1];
        int[] arr2 = new int[k-j];
        for (int l = 0; l < j-i+1; l++) {
            arr1[l]=arr[l+i];
        }
        for (int l = 0; l < k-j; l++) {
            arr2[l]=arr[l+j+1];
        }
        int index1 = 0, index2=0;
        for (int l=i; l < k+1; l++) {
            if (index1== arr1.length&&index2== arr2.length)break;
            if (index2== arr2.length){
                arr[l]=arr1[index1];
                index1++;
                continue;
            }
            if (index1== arr1.length){
                arr[l]=arr2[index2];
                index2++;
                continue;
            }

            if (arr1[index1]<arr2[index2]){
                arr[l]=arr1[index1];
                index1++;
            }else{
                arr[l]=arr2[index2];
                index2++;
            }

        }
    }


    //soln3: tc:O(n^2),sc:O(1)
    public void bubleSort(int []arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
    }

    //insertsort: tc: O(n^2), sc:O(1)
    public void insertSort(int []arr){
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            for (int j = i-1; j >-1; j--) {
                if (tmp<arr[j]){
                    arr[j+1]=arr[j];
                    arr[j]=tmp;
                }else {
                    arr[j+1]=tmp;
                    break;
                }
            }

        }
    }

}


