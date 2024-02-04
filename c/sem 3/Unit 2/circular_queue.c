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
    return ((rear + 1) % capacity == front);
}

void enqueue(int item) {
    if (isFull()) {
        printf("Queue is full. Cannot enqueue.\n");
        return;
    }

    if (isEmpty()) {
        front = 0;
    }

    rear = (rear + 1) % capacity;
    array[rear] = item;
    printf("%d enqueued to the queue.\n", item);
}

int dequeue() {
    int item;

    if (isEmpty()) {
        printf("Queue is empty. Cannot dequeue.\n");
        exit(EXIT_FAILURE);
    }

    item = array[front];

    if (front == rear) {
        front = rear = -1;
    } else {
        front = (front + 1) % capacity;
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
    if (front <= rear) {
        for (i = front; i <= rear; i++) {
            printf("%d ", array[i]);
        }
    } else {
        for (i = front; i < capacity; i++) {
            printf("%d ", array[i]);
        }
        for (i = 0; i <= rear; i++) {
            printf("%d ", array[i]);
        }
    }
    printf("\n");
}

int main() {
    enqueue(1);
    enqueue(2);
    enqueue(3);

    display();

    printf("Dequeued element: %d\n", dequeue());

    display();

    return 0;
}
