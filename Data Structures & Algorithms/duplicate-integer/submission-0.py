class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        numdict ={}
        for n in nums:
            if n in numdict.keys():
                return True
            else:
                numdict[n] = 1
        return False 