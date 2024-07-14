#include<stdio.h>
#include<conio.h>
int main()
{
    int coef = 1, space, i, j;
    printf("\n");
    for(i=0; i<6; i++)
    {
        for(space=1; space <= 6-i; space++)
        printf(" ");
        for(j=0; j <= i; j++)
        {
            if (j==0 || i==0)
            coef = 1;
            else
            coef = coef*(i-j+1)/j;
            printf("%4d", coef);
        }
        printf("\n\n");
    }
    getch();
    return 0;
}




// #include<stdio.h>
// void main(){
// // pattern printing 
//     int pattern[6][11];
//     for(int i = 0; i < 6; i++)
//     {
//         for(int j = 0; j < 11; j++)
//         {
//             pattern[i][j] = 0;
//         }
//     }
    
//     pattern[0][5] = 1;
//     int k,l;
//     printf("\n");
//     for(int i = 0; i < 5; i++)
//     {
//         if(i % 2 == 0)
//             {
//                 // even
//                 for(int j = 0; j < 4; j++)
//                 {
//                     k = 2*j + 1;
//                     l = k + 2;
//                     pattern[i+1][(k+l)/2] = pattern[i][k] + pattern[i][l];
//                 }

//             }
//         else{
//                 // odd
//             for(int j = 0; j < 6; j++)
//                 {
//                     k = 2*j;
//                     l = k + 2;
//                     pattern[i+1][(k+l)/2] = pattern[i][k] + pattern[i][l];
//                 }
//             }
//     }
//     for(int i = 0; i < 6; i++)
//     {
//         for(int j = 0; j < 11; j++)
//         {
//             if(pattern[i][j] == 0)
//             {
//                 printf(" ");
//             }
//             else{
//                 printf("%d",pattern[i][j]);
//             }
//         }
//         printf("\n");
//     }
// }


