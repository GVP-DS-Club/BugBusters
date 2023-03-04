
def searchInsert(nums, target):
    
    if target > nums[len(nums) - 1]:
        return len(nums)

    if target < nums[0]:
        return 0

    start, end = 0, len(nums) - 1
    while start <= end:
        mid = (start + end)/2
        if nums[mid] > target:
            end = mid - 1
            if end >= 0:
                if nums[end] < target:
                        return end + 1
            else:
                    return 0

        elif nums[mid] < target:
            start = mid + 1
            if start < len(nums):
                if nums[start] > target:
                    return start
            else:
                return len(nums)
        else:
            return mid
t=int(input())
while(t>0):
    nums=list(map(int, input().split()))
    target = int(input())
    ans=searchInsert(nums,target)
    print(ans)
    t-=1