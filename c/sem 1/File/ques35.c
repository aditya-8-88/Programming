
#include <stdio.h>
#include<conio.h>

int main() {
    FILE *fp;
    char filename[] = "ques35.txt";
    char ch;

    // open file for reading
    fp = fopen(filename, "w");

    // check if file was successfully opened
    if (fp == NULL) {
        printf("Error: Unable to open file\n");
        return 1;
    }

    // read and print characters until end of file is reached
    while ((ch = fgetc(fp)) != EOF) {
        printf("%c", ch);
    }

    // close file
    fclose(fp);
    getch();
    return 0;
}





// #include <stdio.h>
// #include <string.h>
// #include<stdlib.h>
// // #define BUFFER_SIZE 1024

// int main() 
// {
//     FILE *fs;
//     //  *file2;
//     char ch1;
//     //  ch2;
//     // int same = 1;
    
//     // Open the files for reading
//     fs = fopen("file1.txt", "r");
//     // file2 = fopen("file2.txt", "r");
    
//     // Read and compare the contents of the files
//     // if(file1==NULL&&file2==NULL)
//     // {
//     //     printf("no content found")
//     //     exit(0);
//     while (1) {
//         ch1 =fgetc(fs);
//         // ch2 =fgetc(file2);
//         printf("%c",ch1);
//         // if (ch1!=ch2) {
//         //     printf("File contents unqual");
//         //     exit(0);
//         //     // break;
//         // }
//         if(ch1==EOF)
//         break;
//     }
    
//     // Check if the files are the same
//     // if (same==1)
//     // printf("The contents of the files are the same.\n");
    
    
//     // Close the files
//     fclose(fs);
//     // fclose(file2);
    
//     return 0;
// }
