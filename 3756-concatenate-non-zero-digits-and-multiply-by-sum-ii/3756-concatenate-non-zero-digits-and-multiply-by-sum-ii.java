class Solution {
    int mod = 1000000007;

    public int[] sumAndMultiply(String s, int[][] queries) {
        int n = s.length();

        int[] sum = new int[n + 1];
        int[] cnt = new int[n + 1];

        StringBuilder nz = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int d = s.charAt(i) - '0';

            sum[i + 1] = sum[i] + d;
            cnt[i + 1] = cnt[i];

            if (d != 0) {
                cnt[i + 1]++;
                nz.append(s.charAt(i));
            }
        }

        int m = nz.length();

        long[] pow = new long[m + 1];
        long[] pref = new long[m + 1];

        pow[0] = 1;

        for (int i = 0; i < m; i++) {
            pow[i + 1] = (pow[i] * 10) % mod;
            pref[i + 1] = (pref[i] * 10 + (nz.charAt(i) - '0')) % mod;
        }

        int[] arr = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];

            int digitSum = sum[r + 1] - sum[l];

            int left = cnt[l];
            int right = cnt[r + 1];

            long num = get(pref, pow, left, right);

            arr[i] = (int)((num * digitSum) % mod);
        }

        return arr;
    }

    long get(long[] pref, long[] pow, int l, int r) {
        long ans = pref[r] - (pref[l] * pow[r - l]) % mod;

        if (ans < 0) {
            ans += mod;
        }

        return ans;
    }
}