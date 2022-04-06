public class FindPalindromeWithFixedLength {
    public long[] kthPalindrome(int[] queries, int intLength) {
        long [] res=new long[queries.length];
        String tmp3="",tmp2="";
//        if(queries.length==1){
//            res[0]=1;
//            return res;
//        }
        int[] tmp = new int[]{1,10,100,1000,10000,100000,1000000,10000000};
        // if(intLength%2==0){
        // }
        int len = (intLength-1)/2;
        for(int i=0; i< queries.length;i++){

            // queries[i]=(queries[i]-1);
            long res1 = tmp[len]+queries[i]-1;
            if(String.valueOf(res1).length()>len+1){
                res[i]=-1;
                continue;
            }
            String tmp1 = String.valueOf(res1);
            if(intLength%2==1){
                tmp3= tmp1.substring(0,tmp1.length()-1);
                tmp2 = new StringBuilder(tmp3).reverse().toString();
            } else{
                tmp2 = new StringBuilder(tmp1).reverse().toString();
            }

            res[i]=Long.parseLong(tmp1+tmp2);
        }

        return res;




    }
}
