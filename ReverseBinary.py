#!/usr/bin/env python3

x = bin(int(input()))
x = x.strip("0b")
x = x[::-1]
x = int(x,2)
print(x)