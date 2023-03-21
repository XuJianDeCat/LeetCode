class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int flag1 = 0;
        // 排除全为零的数组
        for (int i = 0; i < len; i++){
            if (nums[i] != 0) {
                flag1 = 1;
                break;
            }
        }
        if (flag1 == 0) {
            
        } else {

        // 排除都不为零的数组
        int flag2 = 0;
       for (int i = 0; i < len; i++){
            if (nums[i] == 0) {
                flag2 = 1;
                break;
            }
        }
         if (flag1 == 0) {
            
        } else {
             // 现在的数组是零和其他数字的混杂
        int i = 0,j = 0;
        for (; j < len; j++) {
            if (nums[j] != 0){
                nums[i] = nums[j];
                i++;
            }
        }
        for(; i < len; i++){
            nums[i] = 0;
        }
        }
       
        }
       
    }
}
// class Solution {
// 	public void moveZeroes(int[] nums) {
// 		if(nums==null) {
// 			return;
// 		}
// 		//第一次遍历的时候，j指针记录非0的个数，只要是非0的统统都赋给nums[j]
// 		int j = 0;
// 		for(int i=0;i<nums.length;++i) {
// 			if(nums[i]!=0) {
// 				nums[j++] = nums[i];
// 			}
// 		}
// 		//非0元素统计完了，剩下的都是0了
// 		//所以第二次遍历把末尾的元素都赋为0即可
// 		for(int i=j;i<nums.length;++i) {
// 			nums[i] = 0;
// 		}
// 	}
// }	
// 2023年3月21日23:07:16，怎么说呢？别人的确实思路确实好，他把我考虑的三种情况都合在一种里面。
//这就不得不提一下我之前的解题想法了，看题，考虑全局，解答。我确确实实是这样的但是 考虑全局是分，而我却没有考虑和，为什么三种情况不可以放到一起，这样减少了代码量，而且提高了解题速度。
