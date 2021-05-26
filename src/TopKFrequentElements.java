import java.util.HashMap;
import java.util.Iterator;

public class TopKFrequentElements {
    public void heapify(int[] arr, int index){
        int flag = index;
        if (index*2+1<arr.length&&map.get(arr[flag])>map.get(arr[index*2+1])){
            flag = index*2+1;
        }
        if (index*2+2<arr.length&&map.get(arr[flag])>map.get(arr[index*2+2])){
            flag = index*2+2;
        }
        if (flag!=index){
            int tmp = arr[flag];
            arr[flag]=arr[index];
            arr[index]=tmp;
            heapify(arr,flag);
        }
    }
    public  HashMap<Integer,Integer> map = new HashMap<>();

    //soln1, tc:O(nlogk), sc: O(n)
//    public int[] topKFrequent(int[] nums, int k) {
//        int[] ans = new int[k];
//
//        for (int i = 0; i < nums.length; i++) {
//            if (map.get(nums[i])==null){
//                map.put(nums[i],1);
//            }else {
//                int count = map.get(nums[i]);
//                count++;
//                map.put(nums[i], count);
//            }
//        }
//        Iterator<Integer> it = map.keySet().iterator();
//        for (int j = 0; j < k; j++) {
//            ans[j]=it.next();
//        }
//        for (int i = k/2-1; i >-1; i--) {
//            heapify(ans,i);
//        }
//        int x;
//        while(it.hasNext()){
//           x = it.next();
//            if (map.get(ans[0])<map.get(x)){
//                ans[0]=x;
//            }
//            this.heapify(ans,0);
//        }
//        return ans;
//    }

    public  int partition(int[] arr,int start,int end){
        int left =start;
        for (int i = start; i < end; i++) {
            if(this.map.get(arr[i])>=this.map.get(arr[end])) {
                int tmp = arr[i];
                arr[i]=arr[left];
                arr[left]=tmp;
                left++;
            }

        }
        int tmp = arr[end];
        arr[end]=arr[left];
        arr[left]=tmp;
        return left;
    }
    public void quickSelect(int[] arr,int start,int end,int k){
        if (start<end){
            int pivot = this.partition(arr,start,end);

            if(pivot>=k){
                this.quickSelect(arr,start,pivot-1,k);
            }else{
                this.quickSelect(arr,pivot+1,end,k);
            }
        }
    }
    //soln2 tc: average O(n), sc: O(n)
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];

        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i])==null){
                map.put(nums[i],1);
            }else {
                int count = map.get(nums[i]);
                count++;
                map.put(nums[i], count);
            }
        }
        int[] tmp = new int[this.map.size()];
        Iterator<Integer> it = map.keySet().iterator();
        for (int i = 0; i < tmp.length; i++) {
            int temp = it.next();
            tmp[i]=temp;

        }
        this.quickSelect(tmp,0,tmp.length-1,k);
        for (int i = 0; i < k; i++) {
            ans[i]=tmp[i];
        }
        return ans;
    }
}
