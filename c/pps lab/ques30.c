// Online C compiler to run C program online
#include <stdio.h>
#include <conio.h>

int main(){
    // Write C code here
    int r,c,sum=0;
    printf("Enter:");
    scanf("%d%d",&r,&c);
    // if(c!=r)
    // {
    //     printf("Matrix can't be multiplied");
    //     exit(0);
    // }
    int arr1[r][c]; 
    int arr2[r][c];  
    int arr3[r][c]; 
    printf("Enter arr1\n");
    for(int i =0;i<r;i++)
        for(int j=0;j<c;j++)
            scanf("%d",&arr1[i][j]);
    printf("Enter arr2\n");
    for(int i =0;i<r;i++)
        for(int j=0;j<c;j++)
            scanf("%d",&arr2[i][j]);
    printf("Matrix multiplication is as follows:\n");
    for(int i =0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            for(int k=0;k<r;k++)
            sum+=arr1[i][k]*arr2[k][j];
            printf("%d ",sum);
            sum=0;
        }
        printf("\n");          
    }
    printf("matrix addition is as follows:\n");
    for(int i =0;i<r;i++)
    for(int j=0;j<c;j++)
    arr3[i][j]=arr1[i][j]+arr2[i][j];
    for(int i =0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        printf("%d ",arr3[i][j]);
        printf("\n");
    }
    
    getch();
    return 0;
}