"""def fibonacci(nterms):
    if nterms <= 1:
        return nterms
    else :
        return(fibonacci(nterms-1) + fibonacci(nterms+1))    
number = int(input("enter the number"))

if number <= 0 :
    print("please enter a positive number")

else :
    print("print series")
    for i in range(number):
        print(fibonacci(i))    """

def fibonacci(number):
    if number <= 1:
        return number
    else:
        return(fibonacci(number-1) + fibonacci(number-2))

nterms = int(input("Enter a number: "))

if nterms <= 0:
    print("Please enter a positive number")
else:
    print("Fibonacci Sequence: ")
    for i in range(nterms):
        print(fibonacci(i))        