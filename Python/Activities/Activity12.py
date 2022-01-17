def calculateSum(num) :
    if num:
        #call recursive function
        return num + calculateSum(num-1)
    else:
        return 0

res = calculateSum(10)
print(res)            