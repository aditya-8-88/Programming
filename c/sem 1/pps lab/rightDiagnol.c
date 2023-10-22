#include <stdio.h>
#include <conio.h>

int main(){
    // Write C code here
    int n,sum=0;
    printf("Enter:");
    scanf("%d",&n);
    int arr[n][n]; 
    printf("Enter arr1\n");
    for(int i =0;i<n;i++)
    for(int j=0;j<n;j++)
    scanf("%d",&arr[i][j]);
    int c=n-1,r=0;
    for(int i =0;i<n;i++)
    {
        sum+=arr[r][c];
        r++;
        c--;
    }
    printf("sum = %d",sum);   
    getch();
    return 0;
}