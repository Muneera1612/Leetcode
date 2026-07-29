class Solution {
    public boolean validDigit(int n, int x) {
        int temp = n;
         // Find the first digit
        int first = n;
        while (first >= 10) {
            first /= 10;
        }

        // If the number starts with x
        if (first == x) {
            return false;
        }
        // Check whether x appears anywhere
        
        while (temp > 0) {
            if (temp % 10 == x) {
                return true;
            }
            temp /= 10;
        }
        return false;
    }
}