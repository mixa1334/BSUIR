def element getNextElementOfSet(set someSet, element previousElement)
    element resultElement = -1;
    element elementA = 0;
    var condition = 0;
    for(el from someSet)
        if(el == previousElement)
            condition = 1:
        else
            if(condition > 0)
                resultElement = el;
                condition = 0:
    return resultElement;

def void main()
    element elementA = 5;
    element elementB = 785;
    set setA = {1,2,elementA,7,elementB};
    for(el from setA)
        print(el);
        print(" "):
    print("\n");

    element nonElement = -1;
    element afterA = getNextElementOfSet(setA, elementA);
    element afterB = getNextElementOfSet(setA, elementB);

    while(afterA != nonElement)
        print(elementA);
        print(" next -> ");
        print(afterA);
        print("\n");
        elementA = afterA;
        afterA = getNextElementOfSet(setA, elementA):

    if(afterB == nonElement)
        print("done"):
    else
        print("error"):
    return;