class vechile:
    def general_usage(self):
        print("General usage of Transportation")

class car(vechile):
    def __init__(self):
        print("i am car")

    def specific_usage(self):
        print("Commute to work")


class Motorcycle(vechile):
    def __init__(self):
        print("i am Motor cycle")

    def specific_usage(self):
        print("Go for Drive")



c=car()
c.general_usage()
c.specific_usage()

m=Motorcycle()
m.general_usage()

print(isinstance(c,Motorcycle))

print(issubclass(car,vechile))

