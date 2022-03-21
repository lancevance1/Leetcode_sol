public class CountOddNumbersinanIntervalRange {
    // tc:o(1),sc:o(1)
    // idea: if high - low + 1 is even, then the result should be half of them.
    // if high - low + 1 is odd, then there two cases:
    // 1. if low is odd, then the result should be half of them + 1;
    // 2. if low is even, then the result should be half of them;
    public int countOdds(int low, int high) {
        // first time code.
//        int res =0;
//        int tmp =high-low+1;
//        if(tmp%2==1){
//            if(low%2==1){
//                res=(tmp+1)/2;
//            }else{
//                res=tmp/2;
//            }
//        }else{
//            res=tmp/2;
//        }
//        return res;

    // optimaized code
//        int tmp =high-low+1;
//        if((tmp&1)==1&&(low&1)==1){
//            return (tmp>>1)+1;
//        }else{
//            return (tmp>>1);
//        }


        //soln3
        return (high+1)/2 - low/2;
    }
}
