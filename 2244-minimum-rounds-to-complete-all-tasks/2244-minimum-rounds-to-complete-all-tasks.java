class Solution {

    public int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int task : tasks) map.put(task, map.getOrDefault(task, 0) + 1);
        int ans = 0;
        for (int val : map.values()) {
            if (val == 1) return -1;
            if (val % 3 == 0) ans += val / 3; 
            else ans += val / 3 + 1;
        }
        return ans;
    }
}
