def clean_str(str):
    result_string_list = []
    for symbol in str:
        if symbol == '<' and len(result_string_list) != 0:
            result_string_list.pop()
        elif symbol != '<':
            result_string_list.append(symbol)
    return ''.join(result_string_list)


if __name__ == "__main__":
    example_str = "h<heasd<<<l<o<oo<<lo"
    print("!!!example: string before cleaning -> \"{}\" and string after cleaning -> \"{}\"".format(example_str,
                                                                                                    clean_str(
                                                                                                        example_str)))
    while True:
        str = input("enter string or \"exit\" for exit:\n")
        if str == "exit":
            print("bye bye)")
            break
        print(clean_str(str))
