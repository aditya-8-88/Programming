#include <stdio.h>
int main() {
   char c, file[50];
   FILE *fp;
   printf("FILENAME: ");
   scanf("%[^\n]", file);
   fp = fopen(file, "r"); 
   printf("READING THE CONTENTS OF THE FILE [ %s ]\n", file);
   while((c = fgetc(fp)) != EOF)
   printf("%c", c);
   fclose(fp);
   return 0;
}