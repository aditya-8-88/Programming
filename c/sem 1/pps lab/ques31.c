#include<stdio.h>
#include<conio.h>
void main() 
{
    int n,sum=0;
    printf("enter n : ");
    scanf("%d",&n);
    int arr[n][n];
    printf("Enter arr\n");
    for(int i =0;i<n;i++)
    for(int j =0;j<n;j++)
    {
        scanf("%d",&arr[i][j]);
        if(i==j)
        sum+=arr[i][j];
    }
    printf("sum= %d",sum);
    getch();
}