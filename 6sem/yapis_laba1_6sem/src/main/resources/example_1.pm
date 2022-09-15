
def void showTwoSets(set A, set B)
    for(elementA from A)
        print(elementA);
        print(" "):
    print("\n");
    for(elementB from B)
        print(elementB);
        print(" "):
    print("\n----------\n");
    return;

def void showOneSet(set someSet)
    for(el from someSet)
        print(el);
        print(" "):
    print("\n");
    return;


def void main ()
    set setA = {1,2,3,4,5};
    set setB = {1,2,3,4,5, 78, 555};
    print("set A and set B -> \n");
    showTwoSets(setA, setB);
    set setC = setA - setB;
    print("difference of A and B -> ");
    showOneSet(setC);

    element elementA = 45;
    element elementB = 99;
    element elementC = 120;

    setC.add(elementA);
    setC.add(elementB);
    setC.add(elementC);
    print("set C -> ");
    showOneSet(setC);

    setC = setC + setA;
    print("C after union with A -> ");
    showOneSet(setC);

    set setD = setC ^ setB;
    print("symmetric difference of C and B -> ");
    showOneSet(setD);
    return;