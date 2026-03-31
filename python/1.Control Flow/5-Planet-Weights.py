# Codédex : Planet Weights

weight = float(input("Enter your Earth weight: "))
planet = int(input("Enter a planet number (1-7): "))

if planet == 1:
    gravity = 0.38
elif planet == 2:
    gravity = 0.91
elif planet == 3:
    gravity = 0.38
elif planet == 4:
    gravity = 2.53
elif planet == 5:
    gravity = 1.07
elif planet == 6:
    gravity = 0.89
elif planet == 7:
    gravity = 1.14
else:
    print('Invalid number')

if planet >= 1 and planet <= 7:
    print("Your weight on that planet:", weight * gravity)
