import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Lance on 10/17/2019.
 */
public class ThreeSumCloset {
    public int threeSumClosest(int[] nums, int target) {
        int left = 1;
        int right = nums.length-1;
        int res = 0;

        Arrays.sort(nums);
        //-4,-1,1,2
        for (int i = 0; i < nums.length; i++) {
            int c = target - nums[i];
            while(left < right){
//                if(c == nums[left] + nums[right]){
//
//
//
//
//
//                }else if(c > nums[left] + nums[right]){
//                    left++;
//                }else{
//                    right--;
//                }

                
            }




        }

        return res;
    }
}
