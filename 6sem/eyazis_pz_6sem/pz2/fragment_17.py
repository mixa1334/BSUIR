mydata = [(1, 2, 3), (1, 3, 4)]
import csv

f = open("my.csv", "w")
writer = csv.writer(f)
for row in mydata:
    writer.writerow(row)
f.close()
