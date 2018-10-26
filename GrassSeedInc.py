cost = float(input())
lawns = int(input())
total = []

for i in range(lawns):
    l, w = input().split()
    l = float(l)
    w = float(w)
    total.append((l*w)*cost)

print(sum(total))