def ex01():
    str="Hello"
    str+="Python"
    print(str)

def sum_all(list):
    sum=0
    for i in list:
        sum+=i
    return sum

def show_reverse(list):
    print(list[::-1])


#ex01()
#print(sum_all([1,2,3,4,5]))
show_reverse([1,2,3,4,5])
show_reverse("ABCDEFG")
