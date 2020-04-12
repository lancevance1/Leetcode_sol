import java.lang.reflect.Array;
import java.util.Arrays;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 1){
            return stones[0];
        }
        for(int i = 0; i < stones.length; i++){
            Arrays.sort(stones);

            stones[stones.length-2] = stones[stones.length-1] - stones[stones.length-2];
            stones[stones.length-1] = 0;
        }
        for(int i = 0; i < stones.length; i++){
            if(stones[i] != 0){
                return stones[i];
            }
        }


        return 0;
    }
}
