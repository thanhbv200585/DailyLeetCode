public class MaxOperations {
    public static void main(String[] args) {
        int[] nums = {2,5,4,4,1,3,4,4,1,4,4,1,2,1,2,2,3,2,4,2};
        int k = 3;
        maxOperations(nums, k);
    }

    public static int maxOperations(int[] nums, int k) {
        int res = 0;
        boolean[] visited = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= k || visited[i]) {
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == k && !visited[j]) {
                    visited[j] = true;
                    res++;
                    break;
                }
            }
        }
        return res;
    }
}
