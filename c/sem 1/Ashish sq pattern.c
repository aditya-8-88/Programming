#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);

    for (int i = 0; i < 2 * n - 1; i++) {
        for (int j = 0; j < 2 * n - 1; j++) {
            int x = i < n ? i : 2 * n - 2 - i;
            int y = j < n ? j : 2 * n - 2 - j;
            int min = x < y ? x : y;
            printf("%d ", n - min);
        }
        printf("\n");
    }

    return 0;
}






// meri ladchat-giri:-

// #include <stdio.h>
// int main() {
//     int n;
//     printf("Enter n:");
//     scanf("%d", &n);
//     int m = 2 * (n) - 1, c = m;
//     int arr[m][m];

//     // Initialize the array to 0
//     for (int i = 0; i < m; i++) {
//         for (int j = 0; j < m; j++) 
//             arr[i][j] = 0;
//     }

//     int f = 0, l = m - 1;
//     int num = n;
//     for (int x = 0; x < n; x++) {
//         for (int i = f; i <= l; i++) {
//             for (int j = f; j <= l; j++) {
//                 arr[i][j] = num;
//             }
//         }
//         m -= 2;
//         f++;
//         l--;
//         num--;
//     }

//     // Print the array
//     for (int i = 0; i < c; i++) {
//         for (int j = 0; j < c; j++)
//             printf("%d ", arr[i][j]);
//         printf("\n");
//     } 
//     return 0;
// }























// // Tell me error in my code
// #include<stdio.h>
// int main()
// {
//     int n;
//     printf("Enter n:");
//     scanf("%d",&n);
//     int m=2*(n)-1, c=m;
//     int arr[m][m];
//     for (int i =0; i < 7; i++){
//       for (int j =0; j < 7; j++) 
//       arr[i][j]=0;}
//     int f=0,l=m-1,c2=n;
//     for(int x=0;x<n;x++)
//     {
//         for (int i =0; i < m; i++)
//         {
//             for (int j =0; j < m; j++) 
//             {
//                 // if(arr[i][j]!=NULL)
//                 if(i==f||j==f||i==l||j==f)
//                 arr[i][j]=c2;
                
//                 // arr[i][j]=n;
//             }
//         }
//         m--;
//         f++;
//         l--;
//         c2--;
//     }
//     for (int i =0; i < c; i++){
//       for (int j =0; j < c; j++)
//       printf("%d ",arr[i][j]);
//       printf("\n");
//     } 
// }



// // // #include<stdio.h>
// // import java.uti.Scanner;
// // public class ptr
// // {
// //     public static void main(String args[])
// //     {
// //         Scanner sc = new Scanner(System.in);
// //         int n;
// //         System.out.print("Enter n:");
// //         // scanf("%d",&n);
// //         n=sc.nextInt();
// //         int m=2*(n)-1, c=m;
// //         int arr[m][m];
// //         // for (int i =0; i < 7; i++){
// //         //   for (int j =0; j < 7; j++) 
// //         //   arr[i][j]=0;}
// //         int f,l;
// //         for(int x=0;x<n;x++)
// //         {
// //             for (int i =0; i < m; i++)
// //             {
// //                 for (int j =0; j < m; j++) 
// //                 {
// //                     if(arr[i][j]!=NULL)
// //                     if(i==f||j==f||i==l||j==f)
// //                     arr[i][j]=n;
                    
// //                     // arr[i][j]=n;
// //                 }
// //             m--;
// //             }
// //             f++;
// //             l--;
// //             n--;
// //         }
// //         for (int i =0; i < c; i++){
// //           for (int j =0; j < c; j++)
// //           System.out.print("%d ",arr[i][j]);
// //           System.out.print("\n");
// //         } 
// //     }