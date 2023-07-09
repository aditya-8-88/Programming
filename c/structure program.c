#include<stdio.h>
#include <string.h>
struct std
{
    int rollno;
    char name[20];
    int marks;
    char section[20];
}st[2];
int main()
{
    int i;
    char n[20];
    for(i=0;i<2;i++)
    {
        printf("Enter record of Roll no %d\n",i+1);
        printf("Enter student's name: ");
        scanf("%s",st[i].name);
        printf("Enter marks: ");
        scanf("%d",&st[i].marks);
        printf("Enter section: ");
        scanf("%s",st[i].section);
    }
    printf("Enter Student's name: ");
    scanf("%s",n);
    for(i=0;i<2;i++)
    {
        if(strcmp(n, st[i].name) == 0)
        {
            printf("Student's Roll no: %d , his marks were %d and studies in section %s",i+1,st[i].marks,st[i].section);
            break;
        }
    }
}