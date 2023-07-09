#include<stdio.h>
#include<conio.h>
void main()
{
    int n1=0,n2=1,sum=0,n;
    printf("Enter number of terms you want:");
    scanf("%d",&n);
    while(n)
    {
        printf("%d ",sum);
        n1=n2;
        n2=sum;
        sum=n1+n2;
        n--; 
    }
    getch();
}

// #include<stdio.h>
// int main()
// {
//     int n;
//     printf("Enter number of terms in series : ");
//     scanf("%d",&n);
//     fib(0,1,n);
// }
// int fib(int n1,int n2,int n)
// {
//     int sum=0;
//     while(n)
//     {
//         printf("%d ",sum);
//         n1=n2;
//         n2=sum;
//         sum=n1+n2;
//         n--; 
//     }
// }