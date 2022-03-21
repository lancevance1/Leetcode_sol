import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
    // tc: o(n), sc: o(n)
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map map = new HashMap();
        boolean res = false;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])&&(i-(int)map.get(nums[i]))<=k){
                return true;
            }
            map.put(nums[i],i);
        }
        return res;
    }

    //tc: o(n), sc: o(min(n,k))
//    public boolean containsNearbyDuplicate(int[] nums, int k) {
//        Set<Integer> set = new HashSet<>();
//        for (int i = 0; i < nums.length; ++i) {
//            if (set.contains(nums[i])) return true;
//            set.add(nums[i]);
//            if (set.size() > k) {
//                set.remove(nums[i - k]);
//            }
//        }
//        return false;
//    }
}
