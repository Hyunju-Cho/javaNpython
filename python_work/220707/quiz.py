def to_list(tpl):
    return list(tpl)

def ex02():
    for i in range(9,0,-1):
        print(7*i,end=" ")

def ex03():
    inc=tuple(range(0,101))
    dec=tuple(range(99,0,-1))

    print(inc+dec)

ds=(1,2,3,)
ds=to_list(ds)
print(ds)
ds="hello" 
ds=to_list(ds)
print(ds)

ex02()
print()
ex03()