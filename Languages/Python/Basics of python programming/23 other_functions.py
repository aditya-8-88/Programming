l = lambda *args : [sum(pair)/len(pair) for pair in zip(*args)]
print(l([1,2,3],[4,5,6],[7,8,9]))