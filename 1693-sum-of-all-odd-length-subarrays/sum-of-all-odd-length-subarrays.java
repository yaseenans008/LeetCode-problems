class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                int len = j - i + 1;
                if (len % 2 != 0) {
                    ans += sum;
                }
            }
        }
        return ans;
    }
}
/*
for (int i = 0; i < n; i++) {
    int left = i + 1;
    int right = n - i;

    int oddCount = (left * right + 1) / 2;

    ans += arr[i] * oddCount;
}
*/