import pygame

# Initialize Pygame
pygame.init()

# Set the display mode
screen = pygame.display.set_mode((400, 300))

# Define the snake's color and initial position
snake_color = (255, 255, 255)
snake_pos = [100, 100]

# Define the food's color and position
food_color = (255, 0, 0)
food_pos = [300, 200]

# Main game loop
running = True
while running:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False

    # Get the current state of the keyboard
    keys = pygame.key.get_pressed()

    # Update the snake's position based on the arrow keys
    if keys[pygame.K_UP]:
        snake_pos[1] -= 10
    if keys[pygame.K_DOWN]:
        snake_pos[1] += 10
    if keys[pygame.K_LEFT]:
        snake_pos[0] -= 10
    if keys[pygame.K_RIGHT]:
        snake_pos[0] += 10

    # Clear the screen
    screen.fill((0, 0, 0))

    # Draw the snake and food on the game screen
    pygame.draw.rect(screen, snake_color, pygame.Rect(*snake_pos, 20, 20))
    pygame.draw.rect(screen, food_color, pygame.Rect(*food_pos, 20, 20))

    # Update the game screen
    pygame.display.update()

# Quit Pygame
pygame.quit()
