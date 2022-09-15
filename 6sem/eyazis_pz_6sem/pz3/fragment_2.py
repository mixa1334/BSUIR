class Human:
    __count = 0

    def __init__(self):
        Human.__count += 1

    def __del__(self):
        Human.__count -= 1

    def get_count(self):
        return Human.__count


h1 = Human()
h2 = Human()
del h1
print(h2.get_count())
