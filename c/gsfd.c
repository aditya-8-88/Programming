#include <stdio.h>

int main() {
   unsigned short vowels = 0;
   char c, file[50];
   FILE *fp;

   printf("FILENAME: ");
   scanf("%[^\n]", file);

   fp = fopen(file, "r"); // 'r' opens the file in read mode

   printf("READING THE CONTENTS OF THE FILE [ %s ]\n", file);

   while((c = fgetc(fp)) != EOF) {
   	  if(c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') {
   	  	vowels++;
   	  }

      printf("%c", c);
   }

   printf("\n");

   printf("NUMBER OF VOWELS: %hu \n", vowels);

   fclose(fp);
   return 0;
}