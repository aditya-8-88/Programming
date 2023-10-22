#include<stdio.h>
#include<conio.h>
int main() 
{
    int n;
    // int arr[];
    printf("enter no of elements in array");
    scanf("%d",&n);
    int arr[n];
    printf("Enter arr\n");
    for(int i =0;i<n;i++)
    scanf("%d",&arr[i]);
    int max=arr[0];
    int min=arr[0];
    for(int i=1;i<n;i++)
    if(max<arr[i])
    max=arr[i];
    else if(min>arr[i])
    min=arr[i];
    printf("max = %d and min = %d",max,min);
    getch();
    return 0;
}