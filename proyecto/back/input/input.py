class B:
    def __init__(self):
        pass
    def f(self):
        return 10;
    def ff(self, z):
        return 10
class A:
    a = B
    aa = B()

A
A()
A.a
A().a
A.aa.f()
A().aa.f()
A().aa.ff(5)
