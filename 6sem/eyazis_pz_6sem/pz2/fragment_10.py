from copy import copy

lst1 = [0, 0, 0]
lst = [copy(lst1) for i in range(3)]
print(lst)
lst[0][1] = 1
print(lst)
