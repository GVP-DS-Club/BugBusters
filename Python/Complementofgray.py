def complement_of_gray(gray):
    # Convert Gray code to binary
    binary = gray[0] + "".join([str(int(gray[i]) ^ int(gray[i-1])) for i in range(1, len(gray))])

    # Compute bitwise complement of binary
    complemented = "".join(["0" if bit == "1" else "1" for bit in binary])

    # Convert complemented binary back to Gray code
    gray_complement = complemented[0] + "".join([str(int(complemented[i]) ^ int(gray[i-1])) for i in range(1, len(complemented))])

    return gray_complement
t=int(input())
while(t>0):
    s=input()
    ans=complement_of_gray(s)
    print(ans+"\n")
    t-=1