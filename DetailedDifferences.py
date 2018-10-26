n = int(input())

for i in range(n):
    string1 = list(input())
    string2 = list(input())
    ans = []
    
    for c in range(len(string1)):
        if string1[c] == string2[c]:
            ans.append('.')
        else:
            ans.append('*')
    
    print("".join(string1))
    print("".join(string2))
    print("".join(ans))