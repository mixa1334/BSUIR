import random

if __name__ == "__main__":
    list = [random.randint(0, 100) * 11 for x in range(20)]
    tuple = tuple(list)
    list.append(100)
    try:
        number = list.index(100)
        del list[number]
        list.insert(number, 9999999)
    except:
        list.reverse()

    try:
        list.insert(0, int("hello"))
    except:
        list.sort()
    finally:
        print(list)
