from random import randint


def sort_list(list):
    for i in range(len(list) - 1, 0, -1):
        for j in range(i):
            if list[j] > list[j + 1]:
                list[j], list[j + 1] = list[j + 1], list[j]


if __name__ == "__main__":
    list = [randint(0, 100) for x in range(20)]
    print("list before sort operation: {}".format(list))
    sort_list(list)
    print("lisr after sort operation: {}".format(list))
