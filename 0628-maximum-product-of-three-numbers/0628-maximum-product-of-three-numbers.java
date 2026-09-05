class Solution {
    public int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int neg1 = Integer.MAX_VALUE;
        int neg2 = Integer.MAX_VALUE;

        for (int i : nums) {
            if (i > max3) {
                if (i > max2) {
                    if (i > max1) {
                        max3 = max2;
                        max2 = max1;
                        max1 = i;
                    } else {
                        max3 = max2;
                        max2 = i;
                    }
                } else {
                    max3 = i;
                }
            }
            if (i < neg2) {
                if (i < neg1) {
                    neg2 = neg1;
                    neg1 = i;
                } else {
                    neg2 = i;
                }
            }
        }
        return Math.max(neg1 * neg2 * max1, max1 * max2 * max3);
    }
}