from csv import reader
with open('source.csv','r') as rf:
    csv_reader = reader(rf)
    # iterator
    next(csv_reader) # not reading the first line of source.csv
    for row in csv_reader:
        print(row)

print()

from csv import DictReader # Dict means dictionary here
with open('source.csv','r') as rf:
    csv_reader = DictReader(rf, delimiter=',') # ',' can be replaced with any other symbol
    for row in csv_reader:
        print(row['name'])