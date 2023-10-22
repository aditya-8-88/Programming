#include <stdio.h>
#include <stdlib.h>
void display(int r)
{
    int x, y;
    // x and y representing coordinates on an imaginary cartisian plane
    for (x = -r; x <= r; x++)
    {
        printf("\t\t\t"); //some tabs to make it kinda "centered"
        for (y = -r; y <= r; y++)
        {
            if (    (x * x + y * y - r * r) < r - 1)
                printf("**");
            else
                printf("--");
        }
        printf("\n");
    }

    for (x = -r; x <= r; x++)
    {
        printf("\t\t\t"); //some tabs to make it kinda "centered"
        for (y = -r; y <= r; y++)
        {
            printf("%s%d", (abs(x * x + y * y - r * r) > 10 ? " " : "  "), abs(x * x + y * y - r * r));
        }
        printf("\n");
    }
}
int main()
{
    int r;
    printf("Enter radius:");
    scanf("%d", &r);
    display(r);
    return 0;
}