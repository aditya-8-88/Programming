class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y

def where_is(point):
    # print(type(point))
    match point:
        case Point(x=0, y=0):
            print("Origin")
        case Point(x=0, y=y):
            print(f"Y={y}")
        case Point(x=x, y=0):
            print(f"X={x}")
        case Point():
            print("Somewhere else")
        case _:
            print("Not a point")

# Create Point objects
point1 = Point(0, 0)
point2 = Point(0, 5)
point3 = Point(10, 0)
point4 = Point(3, 4)
point5 = "Not a point"

# Check the position of each point
where_is(point1)
where_is(point2)
where_is(point3)
where_is(point4)
where_is(point5)
