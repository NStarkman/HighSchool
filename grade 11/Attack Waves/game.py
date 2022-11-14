
#
#
#
import pygame, random

pygame.init()
screen = pygame.display.set_mode([800, 600])
done = False
pygame.mixer.init()

clock = pygame.time.Clock()

WHITE = (255, 255, 255)
BLUE = (0, 0, 255)
GREEN = (0, 255, 0)  # Different color options
RED = (255, 0, 0)

myFont = pygame.font.SysFont("'ocraextended'   ", 60)  # Sets the font to OCR A if needed
GameOverFont = pygame.font.SysFont("'ocraextended'   ", 100)  # Creates a larger version of the font
smallFont = pygame.font.SysFont("'ocraextended'   ", 30)  # Creating a smallest version of the font
background_image = pygame.image.load("Space3.png").convert()  # Makes the background variable an image of space
enemyList = []  # The list for the enemies
titleCounter = 95  # The Timer that controls the speed of the ending
ship_image = pygame.image.load("Ship6.png")  # Makes the ship variable an image of a ship
ship_image = pygame.transform.scale(ship_image, (80, 60))  # Changes the shape of the ship
enemy_image = pygame.image.load("Enemy3.png")  # Makes the enemy an image of a ship
enemy_image2 = pygame.image.load("Enemy5.png")  # Makes the image for the title screen
enemy_image2 = pygame.transform.scale(enemy_image2,(400, 300))  # Changes the size of the enemy photo for the startScreen
enemy_image = pygame.transform.scale(enemy_image, (100, 100))  # Changes the size of the enemy ship
laser_image = pygame.image.load("laser.png")
laser_image = pygame.transform.scale(laser_image, (60, 40))
startSound = pygame.mixer.Sound('gameStart.wav')  # Initializes the sound for the starting screen
startScreen = True  # Boolean for the start screen
playSound = True  # Boolean for the sound
cont = 0
endSong = True
gameOver  = False
restartTrue = False


def scoreFunction(timer):
    value = 100 - 5 * (timer)
    if value < 10:
        value = 10
    return value



class TITLE():
    def __init__(self):
        self.x = 10
        self.y = 250
        self.speedX = 5
        self.waveNum = 2
        self.levelNum = 2
        self.show = False
        self.enemyLabel = myFont.render('NEXT WAVE', 1, (240, 0, 0))
        self.GameOver = GameOverFont.render("GAME OVER", 1, (255, 255, 0))
        self.timeCounter = 0
        self.overSound = pygame.mixer.Sound("GameOverSound.wav")
        self.timerLabel = smallFont.render(('timer: ' + str(int(self.timeCounter))), 1, (0, 0, 200))
        self.scoreLabel = smallFont.render(('Score: '), 1, (0, 0, 200))
        self.startScreen = True
        self.startLabel = myFont.render("ATTACK WAVES", 1, WHITE)
        self.startMessage = smallFont.render("Press 'S' to start", 1, WHITE)
    def move(self):
        screen.blit(self.enemyLabel, (self.x, self.y))
        self.x += self.speedX

        if self.x >= 820:
            self.x = 10
            self.y = 250
            self.show = False
            for a in range(title.levelNum // 3 + 1):
                enemyList.append(ENEMY(title.levelNum))
            self.waveNum += 1
            self.levelNum += 1
            self.enemyLabel = myFont.render(('NEXT WAVE '), 1, (255, 0, 0))

    def go(self):
        self.move()


    def score(self):
        self.timeCounter += 1 / 60
        self.scoreLabel = smallFont.render(('Score:' + str(int(laser.scoreCounter))), 1, (0, 0, 200))
        self.levelLabel = smallFont.render(('Wave: ' + str(int(self.levelNum -1))), 1, (0, 0, 200))
        screen.blit(self.scoreLabel, (170, 10))
        screen.blit(self.levelLabel, (10, 10))



class SHIP():  # The Ship Class - Now called ship before the image is imported
    def __init__(self):  # Initializes the functions, and the variables
        self.x = 200  # Starting location for the ship
        self.y = 300  # Starting location for the ship
        self.radius = 25  # Radius of the ship (Will delete later)
        self.speedX = 0  # the Speed of movement of the ship on the x axis
        self.speedY = 0  # the Speed of movement of the ship on the y axis
        self.score = 0  # The Score variable for the ship
        self.done = False
        self.shipGo = True

    def go(self):
        ship.move()  # Makes the functions go
        ship.draw()
        ship.checkHit()

    def move(self):
        self.x += self.speedX  # Makes the "Ship" move by adding the speed to the variable of the
        self.y += self.speedY
        if self.x >= 300:  # Stops the ship from leaving the screen
            self.x = 300
        elif self.x <= 0:  # If it is greater than 300 on the x, it stops, if it is less than zero in the x, it stops
            self.x = 0
        if self.y >= 600:  # If it is greater than 600 on the y, it stops, if it is less than zero in the y, it stops
            self.y = 600
        elif self.y <= 0:
            self.y = 0
        if self.y >= 550:
            self.y = 550

    def draw(self):
        screen.blit(ship_image, [self.x, self.y])

    def checkHit(self):  # Checks if the enemy/enemy laser hit the "Ship"
        global cont
        for enemy in enemyList:
            if (self.x + 50 >= enemy.x) and (self.x <= enemy.x + 50) and (self.y <= enemy.y + 50) and (self.y + 50 >= enemy.y):
                ship.done = True
                ship.shipGo= False



class LASER():  # The Laser Class
    def __init__(self):  # Initializes the functions, and the variables
        self.x = ship.x + 60  # keeps the lasers x coordinate the same as the ships
        self.y = ship.y + 20  # keeps the lasers y coordinate the same as the ships
        self.change_x = 15  # The Speed/Change rate of the bullet
        self.bulletTrue = False  # Boolean controlling if the laser is on the screen
        self.hitTrue = False
        self.laserSound = pygame.mixer.Sound("laserSound2.wav")
        self.scoreCounter = 0
        self.bulletControl = False


    def go(self):
        self.move()
        self.draw()  # Makes the functions go
        self.checkHit()

    def move(self):
        self.x += self.change_x  # Makes the laser move
        if self.bulletControl ==False:
            if self.x >= 800:
                self.bulletTrue = False

    def makeNew(self):
        if self.bulletTrue == False:
            self.laserSound.play()
            self.bulletTrue = True
            self.x = ship.x + 60  # Makes sure the bullet function goes back to where it started and resets
            self.y = ship.y + 20

    def draw(self):
        # Draws the bullet/laser
        # rect(screen, (0,204,255), (self.x, self.y, 30, 12), 0)
        screen.blit(laser_image, (self.x, self.y))

    def checkHit(self):  # Checks if the laser hit the enemy or not
        global gameOver
        for enemy in enemyList:
            if ((self.x >= enemy.x) and (self.x <= enemy.x + 100) and (self.y <= enemy.y + 100) and (
                    self.y >= enemy.y)):
                enemy.x = random.randint(300, 750)
                enemy.y = random.randint(50, 550)
                self.hitTrue = True
                enemyList.remove(enemy)
                self.bulletTrue = False
                self.scoreCounter += scoreFunction(title.timeCounter)
                title.timeCounter = 0
                gameOver = True
                break
        if not enemyList:
            title.show = True


class ENEMY():  # The Enemy Class
    def __init__(self, wave):  # Initializes the functions, and the variables
        self.x = random.randint(700, 750)  # Starting X Variable of the enemy
        self.y = random.randint(50, 500)  # Starting Y Variable of the enemy
        self.speed_x = random.choice((-1, 1)) * (random.randint(1, 3) + wave)  # The x axis movement speed of the enemy
        self.speed_y = random.choice((-1, 1)) * (random.randint(1, 3) + wave)  # The y axis moving speed if the enemy
        self.hitTrue = False

        # Draws an enemy to the screen (the other ones will be added later)

    def go(self):
        enemy.draw()
        enemy.move()  # Makes the functions go

    def draw(self):
        screen.blit(enemy_image, [self.x, self.y])

    def move(self):
        self.x += self.speed_x  # Moves the enemies around the screen
        self.y += self.speed_y
        if enemy.y > 550 or enemy.y < 0:
            enemy.speed_y = enemy.speed_y * -1
        if enemy.x > 750 or enemy.x < 0:  # Bounces the enemies of the walls (Semi) randomly so the enemy stays on the screen
            enemy.speed_x = enemy.speed_x * - 1

    def checkHit(self):  # Checks if the enemy hit the ship
        if (laser.x >= self.x) and (laser.x <= self.x + 50) and (laser.y <= self.y + 50) and (laser.y >= self.y):
            laser.hitTrue = True


ship = SHIP()
laser = LASER()  # calls the classes to variables in the main loop
# enemy = ENEMY(1)
enemyList.append(ENEMY(1))
title = TITLE()

# MAIN LOOP
while not done:

    screen.fill(WHITE)

    ###########################

    ###########################
    screen.blit(background_image, [0, 0])  # Sets the background image to the screen

    # Calls the go function in the main loop so it goes
    if startScreen == True:
        startLabel = myFont.render("ATTACK WAVES", 1, WHITE)
        startMessage = smallFont.render("Press 'S' to start", 1, WHITE)


        if playSound:
            startSound.play()
            playSound = False
        screen.blit(enemy_image2, [200, 150])
        screen.blit(startLabel, (180, 250))
        screen.blit(startMessage, (225, 310))

    elif startScreen == False :
            restartTrue = False
            laser.bulletControl = False
            if ship.shipGo == True:
                ship.done = False
                ship.go()
                title.score()
                scoreFunction(title.timeCounter)
            if laser.bulletTrue == True:
                laser.go()
            for enemy in enemyList:
                enemy.go()
            if title.show == True:
                title.go()

            elif ship.done == True:

                    ship.shipGo = False
                    title.show = False
                    laser.bulletTrue = False
                    for enemy in enemyList:
                        enemyList.remove(enemy)
                    titleCounter -= 1
                    if titleCounter <=90:
                        if endSong:
                            title.overSound.play()
                            endSong = False
                        startLabel = myFont.render("GAME OVER", 1, (255, 255, 0))
                        startMessage = smallFont.render("Press 'R' to restart", 1, (255, 255, 0))
                        restartTrue = True
                        screen.blit(startLabel, (240, 250))
                        screen.blit(startMessage, (225, 310))
                        title.show = False



     # This is where the score will be shown on the screen and also calculated

    # only calls the bullet if the variable is true
    for event in pygame.event.get():
        if event.type == pygame.QUIT:  # Allows the game to be closed
            done = True
        elif event.type == pygame.KEYDOWN:  # Sets the buttons to be pressed
            if event.key == pygame.K_RIGHT:  # If the right arrow is pressed, the ship will move right
                ship.speedX = 9
                ship.x += ship.speedX
            if event.key == pygame.K_LEFT:  # If the left arrow is pressed, the ship will move left
                ship.speedX = -9
                ship.x -= ship.speedX
            if event.key == pygame.K_UP:  # If the up arrow is pressed, the ship will move up
                ship.speedY = -9
                ship.y -= ship.speedY
            if event.key == pygame.K_DOWN:  # If the right arrow is down, the ship will move down
                ship.speedY = 9
                ship.y += ship.speedY
            if event.key == pygame.K_SPACE:
                # If the right space arrow is pressed, the laser will shoot
                if restartTrue == True:
                    break
                else:
                    laser.makeNew()

            if event.key == pygame.K_s:
                    startScreen = False
            if event.key == pygame.K_r:
                    if restartTrue == True:
                        for enemy in enemyList:
                            enemyList.remove(enemy)
                        enemyList.append(ENEMY(1))
                        for enemy in enemyList:
                            enemy.go()
                        ship.shipGo = True
                        title.levelLabel = 1
                        title.levelNum = 2
                        title.timeCounter = 0
                        laser.scoreCounter = 0
                        endSong = True



        elif event.type == pygame.KEYUP:
            if event.key == pygame.K_RIGHT:
                ship.speedX = 0
            if event.key == pygame.K_LEFT:
                ship.speedX = 0
            if event.key == pygame.K_UP:  # For all of these, once you lwt go, the movement stops
                ship.speedY = 0
            if event.key == pygame.K_DOWN:
                ship.speedY = 0

    ######################################

    # end of your code

    ######################################

    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            done = True

    pygame.display.flip()
    clock.tick(60)

pygame.quit()
