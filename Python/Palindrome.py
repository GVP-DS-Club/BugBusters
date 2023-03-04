t = int(input())

for _ in range(t):
    n = int(input())
    sum = 0
    
    if n >= 0:
        temp = n
        while n > 0:
            k = n % 10
            sum = (sum * 10) + k
            n = n // 10

        if sum == temp:
            print("YES")
        else:
            print("NO")
    else:
        print("NO")