if __name__ == "__main__":
    dict = {}
    for x in range(3):
        name = input("Enter name:\n")
        dict["name{}".format(x)] = name
        surname = input("Enter surname:\n")
        dict["surname{}".format(x)] = surname

    for x, y in dict.items():
        print("key -> {}".format(x))
        print("value -> {} \n-----------".format(y))

    names = dict.get("name2", "oops")
    print("\"{}\" is 2nd name from dict".format(names))
