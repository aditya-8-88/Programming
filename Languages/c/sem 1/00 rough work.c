#include <stdio.h>

// void main(int n) {
//   int i, j, k, l, m;
//   for (i = n; i >= 1; i--) {
//     for (j = n; j > i; j--) {
//       printf(" ");
//     }
//     for (k = i; k <= n; k++) {
//       printf("%d ", k);
//     }
//     for (l = n - 1; l >= i; l--) {
//       printf("%d ", l);
//     }
//     printf("\n");
//   }
// }

int main() 
{
  // int n;
  // int arr[n][n];
  //   printf("Enter n: ");
  //   scanf("%d", &n);
     for (int i =0; i < 7; i++){
      for (int j =0; j < 7; j++) 
      printf("%d%d ",i,j);
     printf("\n");
     }
    // print_pattern(n);

    return 0;

}
