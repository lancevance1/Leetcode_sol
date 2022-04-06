public class MoveZeroes {
    private void swap(int[] arr, int index1,int index2){
        int tmp;
        tmp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=tmp;
    }
//     public void moveZeroes(int[] nums) {
//         int left=0;
//         for(int i=0;i<nums.length;i++){
//             //to find none zero
//             if(nums[i]==0){
//                 continue;
//             }

//             while(left<nums.length&&nums[left]!=0){
//                     left++;
//                 }
//              if(left<i){
//                  swap(nums,i,left);
//             }

//         }
//     }

    //tc:o(n),sc:o(1) minimal operation
    public void moveZeroes(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)count++;
            if(nums[i]!=0)swap(nums,i,i-count);
        }
    }

    //soln3
//    public void moveZeroes(int[] nums) {
//        int n = nums.length, left = 0, right = 0;
//        while (right < n) {
//            if (nums[right] != 0) {
//                swap(nums, left, right);
//                left++;
//            }
//            right++;
//        }
//    }

}
