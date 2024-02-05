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
        printf("\nOVERFLOW\n");
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
