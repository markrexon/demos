import functools

class A:
    def __init__(self, l1):
        self.l1 = l1

    def add(self):
        return sum(self.l1)

class B:
    def __init__(self, l2):
        self.l2 = l2

    def sub(self):
        return functools.reduce(lambda a, b: a - b, self.l2)
      
class C(A, B):
    def __init__(self, product1, product2, extra):
        A.__init__(self, product1)
        B.__init__(self, product2)
        self.extra = extra

    def result(self):
        return self.extra+super().add()+super().sub()

if __name__ == "__main__":
    list1 = list(map(int, input("please enter Integer values").split(" ")))
    list2 = list(map(int, input("please enter values for subtract from your value").split(" ")))
    ex = input("please extra value:")
    if (ex == ""):
        ex = 0
    res = C(list1, list2, int(ex))
    print(res.result())
 

