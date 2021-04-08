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

}
