import random
user_wins = 0
computer_wins = 0
options = ["rock", "paper", "scissors"]

while True:
    ui = input("Type Rock/Paper/Scissors or Q to quit: ").lower()
    if ui == "q":
        break
    if ui not in options:
        continue

    random_number = random.randint(0, 2)
    # rock: 0, paper: 1, scissors: 2
    cp = options[random_number]
    print("Computer picked", cp + ".")

    if ((ui == "rock" and cp == "scissors") or (ui == "paper" and cp == "rock") or (ui == "scissors" and cp == "paper")):
        print("You won!")
        user_wins += 1
    else:
        print("You lost!")
        computer_wins += 1

print("You won", user_wins, "times.\nThe computer won", computer_wins, "times.\nGoodbye!")