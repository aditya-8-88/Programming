#include <stdio.h>
#include <stdlib.h>

#define MAX_SIZE 10

int front = -1, rear = -1;
int capacity = MAX_SIZE;
int array[MAX_SIZE];

int isEmpty() {
    return (front == -1);
}

int isFull() {
    return (rear == capacity - 1);
}

void insert(int item) {
    if (isFull()) {
        printf("Queue is full. Cannot enqueue.\n");
        return;
    }

    if (isEmpty()) {
        front = 0;
    }

    rear++;
    array[rear] = item;
    printf("%d enqueued to the queue.\n", item);
}

int delete() {
    int item;

    if (isEmpty()) {
        printf("Queue is empty. Cannot delete.\n");
        exit(EXIT_FAILURE);
    }

    item = array[front];

    if (front == rear) {
        front = rear = -1;
    } else {
        front++;
    }

    return item;
}

void display() {
    int i;
    if (isEmpty()) {
        printf("Queue is empty.\n");
        return;
    }

    printf("Queue elements: ");
    for (i = front; i <= rear; i++) {
        printf("%d ", array[i]);
    }
    printf("\n");
}

int main() {
    insert(1);
    insert(2);
    insert(3);

    display();

    printf("deleted element: %d\n", delete());

    display();

    return 0;
}