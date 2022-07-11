from sympy import per
from Friend import *

p1=Friend("윤지민","010-111-222")
p2=Friend("이선준","010-333-444")
p3=Friend("장지우","010-555-666")
p4=Friend("윤지율","010-777-888")

person=[p1,p2,p3,p4]

def ex02():
    for i in range(4):
        person[i].show_info()

def ex03():
    for i in range(4):
        if(person[i].get_name().startswith("윤")):
            person[i].show_info()

def ex04():
    for i in range(4):
        if (person[i].get_name()=="장지우"):
            person[i].set_phone("010-999-999")
        
    for i in range(4):
        if (person[i].get_name()=="장지우"):
            person[i].show_info() 

ex02()
ex03()
ex04()
