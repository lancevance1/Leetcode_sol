package ArraryHashTable;

import java.util.ArrayList;
import java.util.List;

public class FindKClosestElements {
    //tc:o(logn+k),sc:o(1)
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        var index = binarySearch(arr, x);
        List<Integer> list = new ArrayList();
        int left = index - 1, right = index;

        while (left >= 0 && right < arr.length && k > 0) {
            int difLeft = Math.abs(arr[left] - x);
            int difRight = Math.abs(arr[right] - x);
            if (difLeft <= difRight) {
                left--;
            } else {
                right++;
            }
            k--;
        }
        if (left == -1) {
            while (k > 0) {
                right++;
                k--;
            }
        }
        if (right == arr.length) {
            while (k > 0) {
                left--;
                k--;
            }
        }
        for (int i = left + 1; i < right; i++) {
            list.add(arr[i]);
        }
        return list;
    }

    private int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
