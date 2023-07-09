#include<stdio.h>
#include<conio.h>
void main() 
{
    int n,s,count=0;
    // int arr[];
    printf("enter no. of elements in array");
    scanf("%d",&n);
    int arr[n];
    printf("Enter arr\n");
    for(int i =0;i<n;i++)
    scanf("%d",&arr[i]);
    printf("Enter element to be searched : ");
    scanf("%d",&s);
    for(int i=0;i<n;i++)
    if(arr[i]==s)
    {
        printf("Element found");
        count++;
        break;
    }
    if(count==0)
    printf("Element not found");
    getch();
}