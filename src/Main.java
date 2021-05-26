import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
//        List<List<Integer>> res = ThreeSumDev.threeSum(new int[]{-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6});
//
//        for (int i = 0; i < res.size(); i++) {
//            for (int j = 0; j < res.get(i).size(); j++) {
//                System.out.println(res.get(i).get(j));
//            }
//        }


//    int res = ThreeSumCloset.threeSumClosest(new int[]{-1, 2, 1, -4}, 1);
//
//        System.out.println(res);

//{-3,-2,-1,0,0,1,2,3}
//        List<List<Integer>> res = FourSum.fourSum(new int[]{0,0,0,0},0);
//
//        for (int i = 0; i < res.size(); i++) {
//            for (int j = 0; j < res.get(i).size(); j++) {
//                System.out.print(res.get(i).get(j));
//            }
//            System.out.println("?????");
//
//        }
//
//    }
//
//        int[] arr;
//        int[] input = {5,5,5,7};
//        arr = SearchRange.searchRange(input, 5  );
//
//        for (int i = 0; i < arr.length ; i++) {
//            System.out.print(arr[i]);
//
//        }


//        ImplementstrStr rep = new ImplementstrStr();
//        String s = "aabcaabxaaaz";
//        int[]arr =new int[s.length()];
//
//        arr = rep.zArray(s);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        int[] arr={7,6,5,4,3,2,1};
//        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
//        int[] arr={7,6,5,4,3,2,1};
//        Sort test = new Sort();
//        test.mergeSort(arr,0,arr.length-1);
//        test.quicksort(arr,0,arr.length-1);

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

//        System.out.println(MaximumSubarray.maxSubArray(arr));

//        Heap heap = new Heap();
//        int[] res = heap.heapSort(arr);
//        test.insertSort(arr);
//        test.bubleSort(arr);
        TopKFrequentElements test1 = new TopKFrequentElements();

              int[] arr={-1,1,4,-4,3,5,4,-2,3,-1};
              int k =3;
        int [] ans = test1.topKFrequent(arr,k);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }


    }

}
