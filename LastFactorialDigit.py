import math
n = input()

for i in range(1,n+1):
    temp = input()
    temp = math.factorial(temp)
    temp = str(temp)
    print(temp[len(temp)-1])