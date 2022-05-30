class father():
    def skills(self):
        print("gardenning","programming")


class mom():
    def moms(self):
        print("cooking, art")

class child(father,mom):
    def skills(self):
        father.skills(self)

        print("sports")

c=child()
c.skills()
m=mom()
m.moms()
c.moms()


