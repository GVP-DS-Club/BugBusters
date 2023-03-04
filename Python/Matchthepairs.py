t = int(input())

for _ in range(t):
    n = int(input())
    Shuffel = []
    for i in range(2*n):
        x = int(input())
        Shuffel.append(x)
    j = n
    for i in range(n):
        print(Shuffel[i], end=" ")
        print(Shuffel[j], end=" ")
        j += 1
    print()