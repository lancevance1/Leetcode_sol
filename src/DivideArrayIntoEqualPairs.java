import java.util.HashMap;
import java.util.Map;

public class DivideArrayIntoEqualPairs {
    //tc: o(n), sc: o(n)
     public boolean divideArray(int[] nums) {
        boolean res = false;
         Map map = new HashMap();
         for (int i = 0; i < nums.length; i++) {
             if(map.containsKey(nums[i])){
                 map.remove(nums[i]);
             }else{
                 map.put(nums[i],true);
             }
         }
         if(map.size()==0){
             return true;
         }
        return res;
    }
}
