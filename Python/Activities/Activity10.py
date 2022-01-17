tuple1 = tuple(input("enter numbers:").split(", "))

print(tuple1)

for num in tuple1 :
    if(int(num) % 5 == 0) :
        print(num)