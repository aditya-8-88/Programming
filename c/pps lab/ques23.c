// Online C compiler to run C program online
#include <stdio.h>
// #include <conio.h>

int main(){
    // Write C code here
    int r,c,sum=0;
    printf("Enter:");
    scanf("%d%d",&r,&c);
    int arr1[r][c]; 
    int arr2[r][c];  
    int arr3[r][c]; 
    printf("Enter arr1 elements\n");
    for(int i =0;i<r;i++)
        for(int j=0;j<c;j++)
            scanf("%d",&arr1[i][j]);
    printf("Enter arr2 elements\n");
    for(int i =0;i<r;i++)
        for(int j=0;j<c;j++)
            scanf("%d",&arr2[i][j]);
   
    for(int i =0;i<r;i++)
    for(int j=0;j<c;j++)
    arr3[i][j]=arr1[i][j]+arr2[i][j];
    for(int i =0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        printf("%d ",arr3[i][j]);
        printf("\n");
    }
    // getch();
    return 0;
}