package com.misha.antlr;

public class CToken {
    public static final String C_INCLUDE = "#include <iostream>\n#include <set>\n#include <algorithm>\nusing namespace std;\n";
    public static final String C_SET_CLEAR = ".clear()";
    public static final String C_SET_SIZE = ".size()";
    public static final String C_SET_DECLARATION = "set<int>";
    public static final String C_SET_INSERT = "insert";
    public static final String C_SET_ERASE = "erase";
    public static final String C_SET_UNION = "set_union(%s.begin(), %s.end(), %s.begin(), %s.end() %s)";
    public static final String C_SET_DIFFERENCE = "set_difference(%s.begin(), %s.end(), %s.begin(), %s.end() %s)";
    public static final String C_SET_INTERSECTION = "set_intersection(%s.begin(), %s.end(), %s.begin(), %s.end() %s)";
    public static final String C_SET_SYMMETRIC_DIFFERENCE = "set_symmetric_difference(%s.begin(), %s.end(), %s.begin(), %s.end() %s)";
    public static final String C_SET_OPERATION_INSERTER = "inserter(%s, %s.begin())";
    public static final String C_OPEN_CURLY_BRACKET = "{";
    public static final String C_CLOSE_CURLY_BRACKET = "}";

    public static final String C_COUT = "std::cout<<";

    public static final String C_INT = "int";
    public static final String C_AUTO = "auto";
    public static final String C_FOR_AUTO = C_AUTO + "&";
    public static final String C_SEMICOLON = ";";
    public static final String C_ASSIGN = "=";
    public static final String C_COMMA = ",";
    public static final String C_COLON = ":";
}
