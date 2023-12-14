# 0. EXIT
# 1. ADD
# 2. SUBTRACT
# 3. MULTIPLY
# 4. DIVIDE

def printResult(num1 , num2 , operation , result):
    print(num1 + " " + operation + " " + num2 +" = " + result)

while True:
    print(" 0.  EXIT \n 1.  ADD (+) \n 2.  SUBTRACT (-) \n 3.  MULTIPLY (x) \n 4.  DIVIDE (/)  \nSelect an operation : ")
    operation = input()

    if operation == "0": #exit
        break
    elif operation == "1": #ADD
        firstValue = input("Enter first value : ")
        secondVlaue = input("Enter second value : ")
        result = int(firstValue) + int(secondVlaue)
        printResult(firstValue , secondVlaue , "+" , str(result))
    elif operation == "2" : #SUBTRACT
        firstValue = input("Enter first value : ")
        secondVlaue = input("Enter second value : ")
        result = int(firstValue) - int(secondVlaue)
        printResult(firstValue , secondVlaue , "-" , str(result))
    elif operation == "3" : #MULTIPLY
        firstValue = input("Enter first value : ")
        secondVlaue = input("Enter second value : ")
        result = int(firstValue) * int(secondVlaue)
        printResult(firstValue , secondVlaue , "*" , str(result))
    elif operation == "4" : #DIVIDE
        firstValue = input("Enter first value : ")
        secondVlaue = input("Enter second value : ")
        result = int(firstValue) / int(secondVlaue)
        printResult(firstValue , secondVlaue , "/" , str(result))
    else:
        print("!!!!! invalid entry !!!!!")


