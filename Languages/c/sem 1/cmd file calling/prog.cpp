#include<stdio.h>
#include<conio.h>
int main(int argc, char *argv[])
{
    int i;
    printf("\n no. of arguments %d ",argc);
    for(i=0;i<argc;i++)
    printf("%s\n",argv[i]);
    printf("\n");
    getch();
}