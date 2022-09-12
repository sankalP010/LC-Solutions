class Solution {

    public int longestOnes(int[] nums, int k) {
        int i = 0, j = 0;
        int cnt = 0;
        int maxLen = 0;
        while (j < nums.length) {
            if (nums[j] == 0) cnt++;
            if (cnt <= k) {
                maxLen = Math.max(maxLen, j - i + 1);
            }
            while (cnt > k) {
                if (nums[i] == 0) cnt--;
                i++;
            }
            j++;
        }
        return maxLen;
    }
}
