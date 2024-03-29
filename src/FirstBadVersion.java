/**
 * 278. First Bad Version
 * You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 *
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
 *
 * You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 5, bad = 4
 * Output: 4
 * Explanation:
 * call isBadVersion(3) -> false
 * call isBadVersion(5) -> true
 * call isBadVersion(4) -> true
 * Then 4 is the first bad version.
 * Example 2:
 *
 * Input: n = 1, bad = 1
 * Output: 1
 *
 *
 * Constraints:
 *
 * 1 <= bad <= n <= 2e31 - 1
 */
public class FirstBadVersion {
    //soln1: binary search version2: left + increament
//    public int firstBadVersion(int n) {
//        int l=0;
//        if(n==1)return 1;
//        for (int b = n/2; b >= 1; b/=2) {
//            while(l<n-b&&!isBadVersion(l+b))l+=b;
//        }
//
//        return l+1;
//    }
    //soln2: binary search version1: left + (right - left)/2
        public int firstBadVersion(int n) {
        int l=0, r=n-1, m;
        while(l <= r){
            m = l + (r-l)/2;
            if (isBadVersion(m)){
                r = m -1;
            }else{
                l = m +1;
            }
        }

        return l; //r+1
    }

    //soln3:
//    public int firstBadVersion(int n) {
//        int left=1, right=n,min = n;
//        if(isBadVersion(left))return left;
//        while(left<right){
//            int mid = left+(right-left)/2;
//            if(isBadVersion(mid)){
//                right=mid;
//                min = Math.min(mid,min);
//            }else{
//                left = mid+1;
//            }
//        }
//        return min;
//    }
    public boolean isBadVersion(int m){
            return true;
    }
}
