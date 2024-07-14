// #include <stdio.h>
// #include <stdlib.h>

// #define MAX_SIZE 10

// int front = -1, rear = -1;
// int capacity = MAX_SIZE;
// int array[MAX_SIZE];

// int isEmpty() {
//     return (front == -1);
// }

// int isFull() {
//     return (rear == capacity - 1);
// }

// void insert(int item) {
//     if (isFull()) {
//         printf("Queue is full. Cannot enqueue.\n");
//         return;
//     }

//     if (isEmpty()) {
//         front = 0;
//     }

//     rear++;
//     array[rear] = item;
//     printf("%d enqueued to the queue.\n", item);
// }

// int delete() {
//     int item;

//     if (isEmpty()) {
//         printf("Queue is empty. Cannot delete.\n");
//         exit(EXIT_FAILURE);
//     }

//     item = array[front];

//     if (front == rear) {
//         front = rear = -1;
//     } else {
//         front++;
//     }

//     return item;
// }

// void display() {
//     int i;
//     if (isEmpty()) {
//         printf("Queue is empty.\n");
//         return;
//     }

//     printf("Queue elements: ");
//     for (i = front; i <= rear; i++) {
//         printf("%d ", array[i]);
//     }
//     printf("\n");
// }

// int main() {
//     insert(1);
//     insert(2);
//     insert(3);

//     display();

//     printf("deleted element: %d\n", delete());

//     display();

//     return 0;
// }

#include <stdio.h>
#include <stdlib.h>
struct node
{
    int data;
    struct node *next;
};
struct node *front;
struct node *rear;

void insert(int item)
{
    struct node *ptr;

    ptr = (struct node *)malloc(sizeof(struct node));
    if (ptr == NULL)
    {
        printf("\nMEMORY OVERFLOW\n");
        return;
    }
    else
    {
        ptr->data = item;
        if (front == NULL)
        {
            front = ptr;
            rear = ptr;
            front->next = NULL;
            rear->next = NULL;
        }
        else
        {
            rear->next = ptr;
            rear = ptr;
            rear->next = NULL;
        }
    }
}
void delete()
{
    struct node *ptr;
    if (front == NULL)
    {
        printf("\nUNDERFLOW\n");
        return;
    }
    else
    {
        ptr = front;
        front = front->next;
        free(ptr);
    }
}
void display()
{
    struct node *ptr;
    ptr = front;
    if (front == NULL)
    {
        printf("\nEmpty queue\n");
    }
    else    
    {
        while (ptr != NULL)
        {
            printf("%d ", ptr->data);
            ptr = ptr->next;
        }
        printf("\n");
    }
}

int main()
{
    display();
    insert(10);
    insert(20);
    insert(30);
    insert(40);
    display();
    delete ();
    display();

    return 0;
}






// #include<stdio.h>   
// #include<stdlib.h>  
// #define maxsize 5  
// void insert();  
// void delete();  
// void display();  
// int front = -1, rear = -1;  
// int queue[maxsize];  
// void main ()  
// {  
//     int choice;   
//     while(choice != 4)   
//     {     
//         printf("\n*************************Main Menu*****************************\n");  
//         printf("\n=================================================================\n");  
//         printf("\n1.insert an element\n2.Delete an element\n3.Display the queue\n4.Exit\n");  
//         printf("\nEnter your choice ?");  
//         scanf("%d",&choice);  
//         switch(choice)  
//         {  
//             case 1:  
//             insert();  
//             break;  
//             case 2:  
//             delete();  
//             break;  
//             case 3:  
//             display();  
//             break;  
//             case 4:  
//             exit(0);  
//             break;  
//             default:   
//             printf("\nEnter valid choice??\n");  
//         }  
//     }  
// }  
// void insert()  
// {  
//     int item;  
//     printf("\nEnter the element\n");  
//     scanf("\n%d",&item);      
//     if(rear == maxsize-1)  
//     {  
//         printf("\nOVERFLOW\n");  
//         return;  
//     }  
//     if(front == -1 && rear == -1)  
//     {  
//         front = 0;  
//         rear = 0;  
//     }  
//     else   
//     {  
//         rear = rear+1;  
//     }  
//     queue[rear] = item;  
//     printf("\nValue inserted ");  
      
// }  
// void delete()  
// {  
//     int item;   
//     if (front == -1 || front > rear)  
//     {  
//         printf("\nUNDERFLOW\n");  
//         return;  
              
//     }  
//     else  
//     {  
//         item = queue[front];  
//         if(front == rear)  
//         {  
//             front = -1;  
//             rear = -1 ;  
//         }  
//         else   
//         {  
//             front = front + 1;  
//         }  
//         printf("\nvalue deleted ");  
//     }  
      
      
// }  
      
// void display()  
// {  
//     int i;  
//     if(rear == -1)  
//     {  
//         printf("\nEmpty queue\n");  
//     }  
//     else  
//     {   printf("\nprinting values .....\n");  
//         for(i=front;i<=rear;i++)  
//         {  
//             printf("\n%d\n",queue[i]);  
//         }     
//     }  
// }  