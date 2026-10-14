class Solution:
    def sumEvenAfterQueries(self, nums: list[int], queries: list[list[int]]) -> list[int]:
        s = 0
        for n in nums:
            if n % 2 == 0:
                s += n
        
        ret = [0] * len(queries)
        i = 0
        for q in queries:
            if nums[q[1]] % 2 == 0:
                s -= nums[q[1]]

            nums[q[1]] += q[0]
            if nums[q[1]] % 2 == 0:
                s += nums[q[1]]
            
            ret[i] = s
            i += 1
        
        return ret
