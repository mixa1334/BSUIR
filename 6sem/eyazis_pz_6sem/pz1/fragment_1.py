def print_message(msg):
    for x in msg:
        print(x)


def get_message(msg_list):
    str = ""
    for x in msg_list:
        str += x
    return str


if __name__ == "__main__":
    list = ["H", "e", "l", "l", "o", " ", "w", "o", "r", "l", "d", "!"]
    print_message(get_message(list))
