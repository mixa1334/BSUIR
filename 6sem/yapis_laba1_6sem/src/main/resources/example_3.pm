def void main()
    element elementA = 7;
    set setA = {1, 2, 3, 4, 5, 6, elementA, 8, 9, 10};
    set setB = {};

    for(el from setA)
        if(el <= elementA)
            element sizeOfSetB = size(setB);
            if(sizeOfSetB < 4)
                setB.add(el):
            else
                clear(setB):

    setB.remove(elementA);
    setB.add(110);

    for(elem from setB)
        print(elem);
        print(" "):
    return;
