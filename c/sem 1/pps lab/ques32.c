#include<stdio.h>
#include<conio.h>
#include <string.h>
int fun1()
{
    char ch[20]="Aditya";
    printf("Length of string = %zu \n",strlen(ch));
}
int fun2() 
{
   char str1[100] = "This is ", str2[100] = "Aditya Pratap";
   // concatenates str1 and str2
   // the resultant string is stored in str1.
   strcat(str1, str2);
   puts(str1);
   puts(str2);
}
int fun3 () 
{
    char str1[20] = "C programming";
    char str2[20];
    // copying str1 to str2
    strcpy(str2, str1);
    puts(str2); // C programming
}
void main() 
{
    fun1();
    fun2();    
    fun3();
    getch();
}