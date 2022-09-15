import pickle

mydata = ("abc", 12, [1, 2, 3])
output_file = open("mydata.dat", "wb")
pickle.dump(mydata, output_file)
output_file.close()
