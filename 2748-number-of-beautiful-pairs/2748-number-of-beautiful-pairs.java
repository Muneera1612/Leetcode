class Solution {
    public int countBeautifulPairs(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            // Find first digit of nums[i]
            int first = nums[i];
            while (first >= 10) {
                first /= 10;
            }

            for (int j = i + 1; j < nums.length; j++) {

                // Find last digit of nums[j]
                int last = nums[j] % 10;

                // Check if first and last are coprime
                if (gcd(first, last) == 1) {
                    count++;
                }
            }
        }

        return count;
    }

    // Euclid's Algorithm
    public int gcd(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
}