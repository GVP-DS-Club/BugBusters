def binary_to_hexadecimal(binary):
    # Pad the binary string with leading zeros so that its length is a multiple of 4
    while len(binary) % 4 != 0:
        binary = "0" + binary

    # Split binary string into 4-bit groups
    groups = [binary[i:i+4] for i in range(0, len(binary), 4)]

    # Convert each group to its hexadecimal equivalent
    hexadecimal = ""
    for group in groups:
        decimal = int(group, 2)
        hexadecimal += hex(decimal)[2:]

    return hexadecimal.upper() # convert to uppercase letters

t=int(input())
while(t>0):
    s=input()
    ans=binary_to_hexadecimal(s)
    print(ans)
    t-=1