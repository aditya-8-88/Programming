#include <stdio.h>
#include <stdlib.h>
#include<conio.h>
int main(int argc, char *argv[])
{
    if (argc != 2) {
        printf("Usage: %s <number>\n", argv[0]);
        return 1;
    }

    int n = atoi(argv[1]);
    int fact = 1;

    for (int i = 1; i <= n; i++) {
        fact *= i;
    }

    printf("Factorial of %d is %d\n", n, fact);
    return 0;
    getch();
}
