package com.misha.antlr;

import java.util.HashSet;
import java.util.Set;

public class VariableContext {
    private final Set<String> idtfs;
    private final Set<String> elements;
    private final Set<String> sets;
    private String functionReturnType;
    private final String NUMBER = "^-?[0-9]+$";

    public VariableContext() {
        idtfs = new HashSet<>();
        elements = new HashSet<>();
        sets = new HashSet<>();
        functionReturnType = "";
    }

    public void clearContext() {
        idtfs.clear();
        elements.clear();
        sets.clear();
        functionReturnType = "";
    }

    public boolean compareFunctionReturnTypeToIdType(String id) {
        switch (functionReturnType) {
            case "set" -> {
                return sets.contains(id);
            }
            case "element" -> {
                return elements.contains(id);
            }
            default -> {
                return false;
            }
        }
    }

    public boolean addAccordingToType(String idtf, String type) {
        switch (type) {
            case "element" -> {
                return this.addElement(idtf);
            }
            case "set" -> {
                return this.addSet(idtf);
            }
            default -> {
                return idtfs.add(idtf);
            }
        }
    }

    public boolean addIdtf(String idtf) {
        return idtfs.add(idtf);
    }

    public boolean addElement(String element) {
        boolean res = idtfs.add(element);
        if (res) {
            elements.add(element);
        }
        return res;
    }

    public void removeElem(String e) {
        elements.remove(e);
        idtfs.remove(e);
    }

    public boolean addSet(String set) {
        boolean res = idtfs.add(set);
        if (res) {
            sets.add(set);
        }
        return res;
    }

    public void setFunctionReturnType(String type) {
        this.functionReturnType = type;
    }

    public boolean hasSet(String s) {
        return sets.contains(s);
    }

    public boolean hasElement(String e) {
        return elements.contains(e);
    }

    public boolean hasIdtf(String i) {
        if (i.equals("") || this.isNumber(i)) {
            return true;
        }
        return idtfs.contains(i);
    }

    public boolean isNumber(String n) {
        return n.matches(NUMBER);
    }
}
