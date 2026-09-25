class Solution:
    def longestPrefix(self, s: str) -> str:
        n = len(s)
        cnt = 0

        for i in range(1, n):
            s_str = s[:i]

            if s.endswith(s_str):
                cnt =  i
        return s[:cnt]