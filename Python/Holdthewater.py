def max_area(height):
    i, j = 0, len(height) - 1
    max_area = 0
    while i < j:
        current_area = min(height[i], height[j]) * (j - i)
        max_area = max(max_area, current_area)
        if height[i] < height[j]:
            i += 1
        else:
            j -= 1
    return max_area
t=int(input())
while(t>0):
    l=[]
    l.append(int(input()))
    ans=max_area(l)
    print(ans)
    t-=1