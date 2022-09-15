class Sentence:
    def __init__(self):
        self.__string = ""
        self.__elements = []
        self.__tree = None
        self.__parse_result = ""

    def __del__(self):
        del self.__string
        del self.__elements
        del self.__tree
        del self.__parse_result

    def get_string(self):
        return self.__string

    def get_elements(self):
        return self.__elements

    def get_tree(self):
        return self.__tree

    def get_parse_result(self):
        return self.__parse_result

    def set_parse_result(self, parse_result):
        self.__parse_result = parse_result

    def set_string(self, string):
        del self.__string
        self.__string = string

    def set_elements(self, elements):
        del self.__elements
        self.__elements = elements

    def set_tree(self, tree):
        if self.__tree:
            del self.__tree
        self.__tree = tree
