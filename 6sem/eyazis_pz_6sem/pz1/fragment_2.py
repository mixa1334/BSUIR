if __name__ == "__main__":
    str = input("enter the number\n")
    number = -999
    try:
        number = int(str)
    except:
        print("Unable to parse str: \"{}\" to number".format(str))
    finally:
        print(number)