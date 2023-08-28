import random

def printResult(scrT1, scrT2, team_1, team_2):
    print("===============[ THE RESULT OF THE MATCH ]===============")
    print()
    print(f"{team_1}->{scrT1} <---> {team_2}->{scrT2}")

def main():
    print("===============[ GUESS THE SCORE ]===============")
    print()
    
    team_1 = input("Enter the name of the first team: ")
    print()
    
    team_2 = input("Enter the name of the second team: ")
    print()
    
    scrT1 = random.randint(1, 10)  # generates a random for team 1 (between 1 and 10)
    scrT2 = random.randint(1, 10)  # generates a random for team 2 (between 1 and 10)

    if team_1 and team_2:
        printResult(scrT1, scrT2, team_1, team_2)  # print result

if __name__ == "__main__":
    main()
