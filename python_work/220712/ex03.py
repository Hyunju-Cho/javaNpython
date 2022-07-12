try:
    age=int(input("나이 입력"))
    a=age/0
except Exception as e:
    print("모든 예외는 여기로 옵니다.",e)
#     print("한글안됨")
# except ZeroDivisionError:
#     print("0으로 나누지 못 함")

print("종료합니다.")
