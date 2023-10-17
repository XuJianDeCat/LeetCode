/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
 public int firstBadVersion(int n) {

        int lo = 1;
        int hi = n;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (isBadVersion(mid)) { // true [lo,mid]
                hi = mid;
            } else { // false [mid + 1,hi]  

                lo = mid + 1;
            }
        }
        return lo;
    }
    /**
    总结：这个题适合使用二分法法查找，二分法的关键是找到中间值。
     */
}