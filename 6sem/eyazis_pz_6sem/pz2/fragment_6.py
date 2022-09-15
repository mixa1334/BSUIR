a = 2
b = 3
for op in "+-*/%":
    e = "a " + op + " b"
    print(e, "->", eval(e))
