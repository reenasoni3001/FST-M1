user1 = input("player 1 name ;")
user2 = input("player 2 name :")

#user input
user1Ans = input(user1 + "choice :").lower()
user2Ans = input(user2 + "choice :").lower()

#who wins
if user1Ans == user2Ans:
    print("it's a tie!")
elif user1Ans == 'rock':
    if user2Ans == 'scissors':
        print("Rock wins!")
    else:
        print("paper wins!")
elif user1Ans == 'scissors':
    if user2Ans == 'paper':
        print("scissors wins!")
    else:
        print("Rock wins!") 
elif user1Ans == 'paper':
    if user2Ans == 'rock':
        print("Paper wins!")
    else:
        print("Scissors wins!")   
else:
    print("invalid input")                            