import java.util.Arrays;

public class LargestPerimeterTriangle {
    // tc: o(nlogn), sc: o(1)
    public int largestPerimeter(int[] nums) {
        int max = 0;
        Arrays.sort(nums);
        for(int i=nums.length-1;i>-1;i--){
            int j=i-1;
            int k=j-1;
            if(j==-1||k==-1)break;
            if(nums[i]<nums[j]+nums[k]){
                return nums[i]+nums[j]+nums[k];
            }else{
                continue;
            }
        }
        return max;
    }
}
