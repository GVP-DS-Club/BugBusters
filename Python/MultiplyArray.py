
from functools import reduce

def productExceptSelf(self, nums):
    prod, zero_cnt = reduce(lambda a, b: a*(b if b else 1), nums, 1), nums.count(0)
    if zero_cnt > 1: return [0]*len(nums)
    for i, c in enumerate(nums):
        if zero_cnt: nums[i] = 0 if c else prod
        else: nums[i] = prod // c
    return nums

t=int(input())
while(t>0):
        nums=list(map(int, input().split()))
        ans=productExceptSelf(nums)
        print(ans)
        print("\n")
        t-=1

