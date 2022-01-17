fruit_shop = {
    "apple" : 10,
    "banana" : 15,
    "orange" : 4
}

key_to_check = input("waht are you looking for?").lower()

if(key_to_check in fruit_shop) :
    print("yes")
else :
    print("no")    