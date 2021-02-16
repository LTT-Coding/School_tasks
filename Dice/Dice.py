import random

dice = True
placeHolder = "===================="

while dice == True:
    answer = input("Would you like to roll a dice? (Yes/No)")
    if answer != "No":
        diceNumber = random.randint(1, 6)
        print("The rolled number is: " + str(diceNumber))
    else:
        dice = False
    print(placeHolder)

