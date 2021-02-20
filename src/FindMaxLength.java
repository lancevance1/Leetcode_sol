public class FindMaxLength {
    public int findMaxLength(int[] nums) {
        int res = 1;
        int res2 = 1; // 1
        int max = Integer.MIN_VALUE; // 0
        int tmp = 0;
        if(nums.length == 1){
            return 0;
        }
        for (int i = 1; i < nums.length; i++){
            if (nums[i] == nums[i-1]){
                res++;
                //max = Math.max(max,res);
            }else {
                max = res;
                res = 1;
            }
            tmp = Math.min(max,res);
        }
        if (max%2 == 1){
            return max-1;
        }else{
            return max;
        }

    }
}
