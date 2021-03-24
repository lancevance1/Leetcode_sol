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

        int[] arr={4,4,9,1,4,5,9,3,3};
        Sort test = new Sort();
        test.quicksort(arr,0,arr.length-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }

}
