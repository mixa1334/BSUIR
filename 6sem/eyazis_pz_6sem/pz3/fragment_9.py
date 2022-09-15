def factor(n):
    return 1 if n == 1 else n * factor(n - 1)


print(factor(6))
