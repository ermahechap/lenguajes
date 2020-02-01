class B:
    def __init__(self):
        pass
    def f(self):
        return 10;
    def ff(self, a):
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

# def f():
#     return 10
#
# f()
#
# class C:
#     pass
#
# class B:
#     c = C()
#     def __init__(self):
#         return
#
# class A:
#     b = B
#     def __init__(self):
#         return
#
# A.b
# a = A
# c = a.b.c




# just to see the tree
#d.b.c
#aa[10]
#cc[10][100].d




# class B:
#     def __init__(self):
#         pass
#
# class A:
#     y = 10
#     z = B()
#     def f(self):
#         self.A = 1
#         return self.A
#
# A.y
# A.f()
