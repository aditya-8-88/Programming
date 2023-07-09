#include<stdio.h>
#include<conio.h>
void main() 
{
    int n;
    // int arr[];
    printf("enter array elements");
    scanf("%d",&n);
    int arr[n];
    printf("Enter arr\n");
    for(int i =0;i<n;i++)
    scanf("%d",&arr[i]);
    int max=arr[0];
    int min=arr[0];
    for(int i=1;i<n;i++)
    {
        if(max<arr[i])
        max=arr[i];
        if(min>arr[i])
        min=arr[i];
    }
    printf("max = %d and min = %d",max,min);
    getch();
}