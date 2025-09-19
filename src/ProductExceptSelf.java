public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] p1 = new int[length];
        int[] p2 = new int[length];
        p1[0] = 1; p2[0] = 1;
        for (int i = 1; i < length; i++) {
            p1[i] = p1[i-1] * nums[i-1];
            p2[i] = p2[i-1] * nums[length - i];
        }
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = p1[i] * p2[length - 1 - i];
        }

        return result;
    }
}
