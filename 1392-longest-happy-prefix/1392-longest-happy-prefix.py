class Solution:
    def longestPrefix(self, s: str) -> str:
        n = len(s)
        cnt = 0

        for i in range(n - 1, 0, -1):
            s_str = s[:i]

            if s.endswith(s_str):
                return s[:i]
        return ""