import pygame as pg
import random
import os
pg.mixer.init() # no effect on the game on this line's disappearance
pg.init() # x=pg.init() # print(x)


# Colors
white = (255, 255, 255)
red = (255, 0, 0)
black = (0, 0, 0)
# Creating window
screen_width = 900
screen_height = 600
gameWinResolution = pg.display.set_mode((screen_width, screen_height))
#Background Image
bgimg = pg.image.load("snake.jpg")
bgimg = pg.transform.scale(bgimg, (screen_width, screen_height)).convert_alpha()
# Game Title
pg.display.set_caption("My First Game")
pg.display.update()
clock = pg.time.Clock()
font = pg.font.SysFont(None, 55) # 'SysFont' sets the default value to 'font used by system' but size should be 55  


def text_screen(text, color, x, y):# Properties of text on the game screen
    screen_text = font.render(text, True, color)
    gameWinResolution.blit(screen_text, [x,y])






# def plot_snake(gameWinResolution, color, snk_list, snake_size):# ploting the snake on game screen
#     count=1
#     for x,y in snk_list:
#         if count>1:
#             pg.draw.rect(gameWinResolution, color, [x, y, snake_size, snake_size])
#         else:
#             pg.draw.circle(gameWinResolution,black,[x,y],16)
#         count+=1


def plot_snake(gameWinResolution, color, snk_list, snake_size):# ploting the snake on game screen
    for x,y in snk_list:
         pg.draw.rect(gameWinResolution, color, [x, y, snake_size, snake_size])
        #  pg.draw.circle(gameWinResolution,black,[x,y],16)






def gameloop():
    # Game specific variables
    exit_game = False
    game_over = False
    snake_x = 45
    snake_y = 55
    velocity_x = 2
    velocity_y = 0
    snk_list = []
    snk_length = 1 # initial snake length    
    food_x = random.randint(20, screen_width / 2)
    food_y = random.randint(20, screen_height / 2)
    score = 0
    init_velocity = 5
    snake_size = 30
    fps = 60
    # Check if hiscore file exists
    if(not os.path.exists("hiscore.txt")):
        with open("hiscore.txt", "w") as f:
            f.write("0")
    with open("hiscore.txt", "r") as f:
        hiscore = f.read()

    while not exit_game:
        if game_over:
            with open("hiscore.txt", "w") as f:
                f.write(str(hiscore))
            gameWinResolution.fill(white)
            text_screen("Game Over! Press Enter To Continue", red, 100, 250)

            for event in pg.event.get():
                if event.type == pg.QUIT:
                    exit_game = True
                if event.type == pg.KEYDOWN:
                    if event.key == pg.K_RETURN:
                        welcome()
        else:
            for event in pg.event.get():
                if event.type == pg.QUIT:
                    exit_game = True
                if event.type == pg.KEYDOWN:
                    if (event.key == pg.K_RIGHT):
                        velocity_x = init_velocity
                        velocity_y = 0
                    if event.key == pg.K_LEFT:
                        velocity_x = - init_velocity
                        velocity_y = 0
                    if event.key == pg.K_UP:
                        velocity_y = - init_velocity
                        velocity_x = 0
                    if event.key == pg.K_DOWN:
                        velocity_y = init_velocity
                        velocity_x = 0
                    if event.key == pg.K_w:
                        score +=10
                    if event.type == pg.K_q:
                        exit_game = True
            snake_x = snake_x + velocity_x
            snake_y = snake_y + velocity_y

            if abs(snake_x - food_x)<35 and abs(snake_y - food_y)<35:
                score +=10
                food_x = random.randint(20, screen_width / 2)
                food_y = random.randint(20, screen_height / 2)
                snk_length +=5
                if score>int(hiscore):
                    hiscore = score

            gameWinResolution.fill(white)
            gameWinResolution.blit(bgimg, (0, 0))
            text_screen("Score: " + str(score) + "  Highest Score: "+str(hiscore), red, 5, 5)
            pg.draw.rect(gameWinResolution, red, [food_x, food_y, snake_size, snake_size])

            head = []
            head.append(snake_x)
            head.append(snake_y)
            snk_list.append(head)

            if len(snk_list)>snk_length:
                del snk_list[0]

            if head in snk_list[:-1]:
                game_over = True
                pg.mixer.music.load('gameover.mp3')
                pg.mixer.music.play()

            if snake_x<0 or snake_x>screen_width or snake_y<0 or snake_y>screen_height:
                game_over = True
                pg.mixer.music.load('gameover.mp3')
                pg.mixer.music.play()
            plot_snake(gameWinResolution, black, snk_list, snake_size)
        pg.display.update()
        clock.tick(fps)
    pg.quit()
    quit()

def welcome():
    exit_game = False
    while not exit_game:
        gameWinResolution.fill((233,210,229))
        text_screen("Welcome to Snakes", black, 260, 250)
        text_screen("Press ENTER Bar To Play", black, 232, 290)
        for event in pg.event.get():
            if event.type == pg.QUIT:
                exit_game = True
            if event.type == pg.KEYDOWN:
                if event.key == pg.K_RETURN:
                    pg.mixer.music.load('back.mp3')
                    # pg.mixer.music.load('back2.mp3')
                    pg.mixer.music.play()
                    gameloop()

        pg.display.update()
        # clock.tick(60)
welcome()