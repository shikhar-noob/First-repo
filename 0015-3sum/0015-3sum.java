import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> outerList = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // skip duplicate values for i
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1, right = nums.length - 1;

            while (left < right) {
                int result = nums[i] + nums[left] + nums[right];

                if (result > 0) {
                    right--;
                } else if (result < 0) {
                    left++;
                } else {
                    List<Integer> innerList = new ArrayList<>();
                    innerList.add(nums[i]);
                    innerList.add(nums[left]);
                    innerList.add(nums[right]);
                    outerList.add(innerList);

                    left++;
                    right--;

                    // skip duplicates for left and right
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                }
            }
        }
        return outerList;
    }
}