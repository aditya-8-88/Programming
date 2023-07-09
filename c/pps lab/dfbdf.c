// Online C compiler to run C program online
#include <stdio.h>
#include <conio.h>
float main()
{
    // clrscr();
    float a,b,temp=0;
    printf("Enter both values:\n");
    scanf("%f%f",&a,&b);
    temp=a;
    a=b;
    b=temp;
    printf("Swaped values=%f %f",a,b);
    getch();
}