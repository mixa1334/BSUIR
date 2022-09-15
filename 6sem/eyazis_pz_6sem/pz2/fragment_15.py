import pickle

with open("mydata.dat", "rb") as file:
    voc = pickle.load(file)
    print(voc)
