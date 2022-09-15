import csv

table = csv.reader(open("my.csv"))
for row in table:
    print(row)
