#include <stdio.h>

int main(int argc, char *argv[]) {
    if (argc != 2) {
        printf("Usage: %s <integer>\n", argv[0]);
        return 1;
    }
    
    int num = atoi(argv[1]);
    printf("You entered: %d\n", num);
    
    return 0;
}







// #include<stdio.h>
// #include<stdlib.h>
// #include<string.h>
// #include<math.h>

// #include<conio.h>
// void main()
// {
//     // int a,b,c,d,e;
//     // int marks,per;
//     // printf("Enter the marks:");
//     // scanf("%d%d%d%d%d",&a,&b,&c,&d,&e);
//     // marks=a+b+c+d+e;
//     // per=marks*100/500;
//     // printf("The marks are %d\n",marks);
//     // printf("The percentage is %d",per);

//     // int a=5,b=7;
//     // a=a+b;
//     // b=a-b;
//     // a=a-b;
//     // printf("%d %d\n",a,b);
//     // int c=2,d=3;
//     // c=c*d;
//     // d=c/d;  
//     // c=c/d;
//     // printf("%d %d",c,d);

//     // int a,b;
//     // printf("Enter the first number:");
//     // scanf("%d",&a);
//     // printf("Enter the second number:");
//     // scanf("%d",&b);
//     // int c= (a > b) ? a : b;
//     // int d= (a < b) ? a : b;
//     // int m=d;
//     // while(2>1)
//     // {
//     //     if(c%d==0 && m%d==0)
//     //     {
//     //         printf("%d is gcd",d);
//     //         break;
//     //     }
//     //     d--;
//     // 
    
//     // int a ,b;
//     // char ch;
//     // printf("Enter the first number:");
//     // scanf("%d",&a);
//     // printf("Enter the second number:");
//     // scanf("%d",&b);
//     // printf("Enter operand:");
//     // scanf(" %c",&ch);
//     // switch(ch)
//     // {
//     //     case '+': printf("%d + %d = %d",a,b,a+b);
//     //     break;
//     //     case '-': printf("%d - %d = %d",a,b,a-b);
//     //     break;
//     //     case '*': printf("%d * %d = %d",a,b,a*b);
//     //     break;
//     //     case '/': printf("%d / %d = %d",a,b,a/b);
//     //     break;
//     //     default: printf("Invalid operand");
//     // }
// //     int d,rem,bin=0,i=1;
// //     printf("Enter a decimal :");
// //     scanf("%d",&d);

// //     while (d!=0) {
// //     rem = d % 2;
// //     d /= 2;
// //     bin += rem * i;
// //     i *= 10;
// //   }
// //     printf("Binary=%d",bin);

//     // int bin,rem,d=0,i=0;
//     // printf("Enter a binary :");
//     // scanf("%d",&bin);
//     // while (bin!=0)
//     // {
//     //     rem = bin % 10;
//     //     d += rem * pow(2,i);
//     //     bin /= 10;
//     //     i++;
//     // }
//     // printf("Decimal=%d",d);


//      int n;
//     printf("Enter the number of elements to store in the array: ");
//     scanf("%d", &n);

//     // Allocate memory for an integer array of size n
//     int* arr = (int*) malloc(n * sizeof(int));

//     if (arr == NULL) {
//         printf("Error: Unable to allocate memory\n");
//         return 1;
//     }

//     // Initialize the array with random values
//     for (int i = 0; i < n; i++) {
//         arr[i] = rand() % 100;
//     }

//     // Print the array
//     printf("The array is: ");
//     for (int i = 0; i < n; i++) {
//         printf("%d ", arr[i]);
//     }
//     printf("\n");

//     // Reallocate memory to store twice as many elements
//     arr = (int*) realloc(arr, 2 * n * sizeof(int));
//     if (arr == NULL) {
//         printf("Error: Unable to reallocate memory\n");
//         return 1;
//     }

//     // Append the original array with new random values
//     for (int i = n; i < 2 * n; i++) {
//         arr[i] = rand() % 100;
//     }

//     // Print the new, larger array
//     printf("The new array is: ");
//     for (int i = 0; i < 2 * n; i++) {
//         printf("%d ", arr[i]);
//     }
//     printf("\n");

//     // Free the memory allocated for the array
//     free(arr);


//     getch();
// }