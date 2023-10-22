#include <stdio.h>

int main() {
    int n;
    printf("Enter: ");
    scanf("%d", &n);
    int value=n*(n+1)/2;
    for (int i = 0; i < n; i++)
    {
        for(int j=0;j<=i;j++)
        {
            printf("%d \t",value); 
            value--;
        }
        printf("\n");
    } 
}