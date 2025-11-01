a=int(input("A: "))
b=int(input("B: "))
op=input("Operator (+ - * /): ")
if op=="+":
    print(a+b)
elif op=="-":
    print(a-b)
elif op=="*":
    print(a*b)
elif op=="/":
    if b!=0:
        print(a/b)
    else:
        print("Division by zero!")
else:
    print("Unknown operator")
