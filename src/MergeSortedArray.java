public class MergeSortedArray {
    // tc:o(n) n is nums1.length, sc:o(1)
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=n-1;
        int k=m-1;

        for(int i=nums1.length-1; i>-1;i--){
            if(j<0)break;
            if(k<0||nums1[k]<=nums2[j]){
                nums1[i]=nums2[j];
                j--;

            }else{
                nums1[i]=nums1[k];
                k--;
            }

        }
    }


}
