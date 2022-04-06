public class ThreeSumWithMultiplicity {
    //sorting two pointer tc:o(n^2)
//     public int threeSumMulti(int[] arr, int target) {
//         long res= 0;
//         Arrays.sort(arr);
//         for(int i=0;i<arr.length-2;i++){
//             long mod=(long)10e8+7;
//             long sum = target-arr[i];
//             int l=i+1,r=arr.length-1;

//             while(l<r){
//                 int pre1=-1,pre2=-1;
//                 if(arr[l]==sum-arr[r]&&arr[l]==arr[r]){
//                     long tmp = (r-l)*(r-l+1)/2;
//                     tmp%=mod;
//                     res+=tmp;
//                     res%=mod;
//                     break;
//                 }
//                 long count1=0,count2=0;
//                 while(l<r&&arr[l]==sum-arr[r]){
//                     pre1=l;
//                    count1++;
//                     count1%=mod;
//                     l++;
//                 }
//                 if(pre1!=-1)
//                 l=pre1;
//                 while(l<r&&arr[l]==sum-arr[r]){
//                     pre2=r;
//                    count2++;
//                      count2%=mod;
//                     r--;
//                 }
//                 if(pre2!=-1)
//                 r=pre2;
//                 if(arr[l]<sum-arr[r]){

//                     l++;
//                 }else if(arr[l]>sum-arr[r]){
//                     r--;
//                 }else{
//                     l++;
//                     r--;
//                 }


//                count1%=mod;
//                 count2%=mod;
//                  long prod = count1*count2;
//                 prod%=mod;
//                 res+=prod;
//                 res%=mod;
//             }





//         }

//         return (int)res;
//     }


    //counting sort two pointer
    //tc:o(n+k^2) k is the maximum possible value of A[i], sc:o(k)
    public int threeSumMulti(int[] arr, int target) {
        long res= 0;
        long mod=(long)1e9+7;
        long[] count=new long[101];
        for(int c:arr){
            count[c]++;
        }
        boolean isFind =false;

        for(int i=0;i<101&&!isFind;i++){
            if(count[i]==0)continue;
            long sum = target-i;
            int l=i,r=100;
            count[i]--;
            while(l<=r){
                if(count[l]==0){
                    l++;
                    continue;
                }
                if(count[r]==0){
                    r--;
                    continue;
                }


                if(l==sum-r){
                    //(0 0 0 0) 0
                    //(2 2 2 2) 6
                    if(i==l&&l==r){
                        res+= (count[i]-1)*(count[i]+1)*(count[i])/6;
                        res%=mod;
                        isFind =true;
                        break;
                    }else if(i==l&&i!=r){
                        res+= count[r]*(count[i]+1)*(count[i])/2;
                    }
                    // (1 2 2 2), 5
                    else if(r==l&&i!=r){
                        res+= (count[i]+1)*(count[l])*(count[l]-1)/2;
                    }else{
                        res+= (count[i]+1)*count[l]*count[r];
                    }
                    res%=mod;
                    l++;
                    r--;
                    continue;
                }else if(l<sum-r){
                    l++;
                }else{
                    r--;
                }
            }
        }
        return (int)res;
    }


    //fastest anwser
//         public int threeSumMulti(int[] A, int target) {
//         int MOD = 1_000_000_007;

//         // Initializing as long saves us the trouble of
//         // managing count[x] * count[y] * count[z] overflowing later.
//         long[] count = new long[101];
//         int uniq = 0;
//         for (int x: A) {
//             count[x]++;
//             if (count[x] == 1)
//                 uniq++;
//         }

//         int[] keys = new int[uniq];
//         int t = 0;
//         for (int i = 0; i <= 100; ++i)
//             if (count[i] > 0)
//                 keys[t++] = i;

//         long ans = 0;
//         // Now, let's do a 3sum on "keys", for i <= j <= k.
//         // We will use count to add the correct contribution to ans.

//         for (int i = 0; i < keys.length; ++i) {
//             int x = keys[i];
//             int T = target - x;
//             int j = i, k = keys.length - 1;
//             while (j <= k) {
//                 int y = keys[j], z = keys[k];
//                 if (y + z < T) {
//                     j++;
//                 } else if (y + z > T) {
//                     k--;
//                 } else {  // # x+y+z == T, now calc the size of the contribution
//                     if (i < j && j < k) {
//                         ans += count[x] * count[y] * count[z];
//                     } else if (i == j && j < k) {
//                         ans += count[x] * (count[x] - 1) / 2 * count[z]; //Cn 2
//                     } else if (i < j && j == k) {
//                         ans += count[x] * count[y] * (count[y] - 1) / 2;
//                     } else {  // i == j == k
//                         ans += count[x] * (count[x] - 1) * (count[x] - 2) / 6; //Cn 3
//                     }

//                     ans %= MOD;
//                     j++;
//                     k--;
//                 }
//             }
//         }

//         return (int) ans;
//     }

}
