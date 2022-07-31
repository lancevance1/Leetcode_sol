package Algorithm;

import java.util.Arrays;
import java.util.Random;

public class Sort {
    //average TC: O(nlogn) SC:O(1)
    public void quicksort(int[] arr, int i, int j) {
        if (i < j) {
            int mid = partition(arr, i, j);
            quicksort(arr, i, mid - 1);
            quicksort(arr, mid + 1, j);
        }
    }

    private int partition(int[] arr, int i, int j) {
        Random random = new Random();
        int pivot = random.nextInt(j - i + 1) + i; //随机化版
        swap(arr, j, pivot);
        pivot = arr[j]; //算法导论版

        int left = i - 1; //left 为小于pivot的子数组的最大index
        for (int k = i; k < j; k++) { // k 为遍历数组
            if (arr[k] <= pivot) {
                left++;
                swap(arr, left, k);
            }
        }
        swap(arr, j, left + 1);
        return left + 1;
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }

    //soln2: mergesort recursive version, tc: O(nlogn), sc: O(n) additional space complexity
//    public void mergeSort(int[] arr, int left, int right) {
//        if (left == right) return;
//        int mid = left + ((right - left) >> 1);
//        mergeSort(arr, left, mid);
//        mergeSort(arr, mid + 1, right);
//        merge(arr, left, mid, right);
//    }
//
//    private void merge(int[] arr, int left, int mid, int right) {
//        int[] arrLeft = new int[mid - left + 1];
//        int[] arrRight = new int[right - mid];
//        for (int i = 0; i < mid - left + 1; i++) {
//            arrLeft[i] = arr[i + left];
//        }
//        for (int i = 0; i < right - mid; i++) {
//            arrRight[i] = arr[i + mid + 1];
//        }
//        int indexLeft = 0, indexRight = 0;
//        for (int i = left; i < right + 1; i++) {
//            if (indexLeft == arrLeft.length && indexRight == arrRight.length) break;
//            // 右边子数组取完，把左边子数组merge到arr
//            if (indexRight == arrRight.length) {
//                arr[i] = arrLeft[indexLeft];
//                indexLeft++;
//                continue;
//            }
//            // 反之亦然
//            if (indexLeft == arrLeft.length) {
//                arr[i] = arrRight[indexRight];
//                indexRight++;
//                continue;
//            }
//
//            //merge
//            if (arrLeft[indexLeft] < arrRight[indexRight]) {
//                arr[i] = arrLeft[indexLeft];
//                indexLeft++;
//            } else {
//                arr[i] = arrRight[indexRight];
//                indexRight++;
//            }
//        }
//    }

    // 用于辅助合并有序数组
    private int[] temp;

    public void sort(int[] nums) {
        // 先给辅助数组开辟内存空间
        temp = new int[nums.length];
        // 排序整个数组（原地修改）
        mergeSort(nums, 0, nums.length - 1);
    }

    // 定义：将子数组 nums[lo..hi] 进行排序
    private void mergeSort(int[] nums, int lo, int hi) {
        if (lo == hi) {
            // 单个元素不用排序
            return;
        }
        // 这样写是为了防止溢出，效果等同于 (hi + lo) / 2
        int mid = lo + (hi - lo) / 2;
        // 先对左半部分数组 nums[lo..mid] 排序
        mergeSort(nums, lo, mid);
        // 再对右半部分数组 nums[mid+1..hi] 排序
        mergeSort(nums, mid + 1, hi);
        // 将两部分有序数组合并成一个有序数组
        merge(nums, lo, mid, hi);
    }

    // 将 nums[lo..mid] 和 nums[mid+1..hi] 这两个有序数组合并成一个有序数组
//    private void merge(int[] nums, int lo, int mid, int hi) {
//        // 先把 nums[lo..hi] 复制到辅助数组中
//        // 以便合并后的结果能够直接存入 nums
//        for (int i = lo; i <= hi; i++) {
//            temp[i] = nums[i];
//        }
//
//        // 数组双指针技巧，合并两个有序数组
//        int i = lo, j = mid + 1;
//        for (int p = lo; p <= hi; p++) {
//            if (i == mid + 1) {
//                // 左半边数组已全部被合并
//                nums[p] = temp[j++];
//            } else if (j == hi + 1) {
//                // 右半边数组已全部被合并
//                nums[p] = temp[i++];
//            } else if (temp[i] > temp[j]) {
//                nums[p] = temp[j++];
//            } else {
//                nums[p] = temp[i++];
//            }
//        }
//    }

    private void merge(int[] nums, int left, int right, int mid) {
        if (left == right) return;
        for (int i = left; i < right + 1; i++) {
            temp[i] = nums[i];
        }
        // 数组双指针技巧，合并两个有序数组
        int l = left;
        int m = mid + 1;
        for (int i = left; i < right + 1; i++) {
            // 右半边数组已全部被合并
            if (m > right) {
                nums[i] = temp[l];
                l++;
                continue;
            }
            // 左半边数组已全部被合并
            if (l > mid) {
                nums[i] = temp[m];
                m++;
                continue;
            }
            if (temp[m] < temp[l]) {
                nums[i] = temp[m];
                m++;
            } else {
                nums[i] = temp[l];
                l++;
            }
        }
    }

    //soln3: tc:O(n^2),sc:O(1)
    public void bubleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    //insertsort: tc: O(n^2), sc:O(1)
    public void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            for (int j = i - 1; j > -1; j--) {
                if (tmp < arr[j]) {
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                } else {
                    arr[j + 1] = tmp;
                    break;
                }
            }
        }
    }
}


