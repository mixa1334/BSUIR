import os
import random

if __name__ == "__main__":
    for i in range(11):
        list = [random.randint(0, 100) for x in range(10)]
        with open("test.txt", "a+") as file:
            file.write(list.__str__() + "\n")

    with open("test.txt") as file:
        for line in file.readlines():
            print("line -> " + line)

    os.remove("test.txt")
