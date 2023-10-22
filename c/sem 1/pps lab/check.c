#include <stdio.h>
#include <stdlib.h>

int main()
{
    int* ptr1 = (int*)malloc(5 * sizeof(int));
    int* ptr2 = (int*)calloc(5, sizeof(int));

    printf("Contents of ptr1:\n");
    for (int i = 0; i < 5; i++)
    {
        printf("%d ", ptr1[i]);
    }
    printf("\n");

    printf("Contents of ptr2:\n");
    for (int i = 0; i < 5; i++)
    {
        printf("%d ", ptr2[i]);
    }
    printf("\n");

    free(ptr1);
    free(ptr2);

    return 0;
}
