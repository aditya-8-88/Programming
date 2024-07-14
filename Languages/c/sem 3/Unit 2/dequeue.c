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
    return ((rear + 1) % capacity == front || (front == 0 && rear == capacity - 1));
}

void enqueueFront(int item) {
    if (isFull()) {
        printf("Deque is full. Cannot enqueue at the front.\n");
        return;
    }

    if (isEmpty()) {
        front = rear = 0;
    } else {
        front = (front - 1 + capacity) % capacity;
    }

    array[front] = item;
    printf("%d enqueued at the front of the deque.\n", item);
}

void enqueueRear(int item) {
    if (isFull()) {
        printf("Deque is full. Cannot enqueue at the rear.\n");
        return;
    }

    if (isEmpty()) {
        front = rear = 0;
    } else {
        rear = (rear + 1) % capacity;
    }

    array[rear] = item;
    printf("%d enqueued at the rear of the deque.\n", item);
}

int dequeueFront() {
    int item;

    if (isEmpty()) {
        printf("Deque is empty. Cannot dequeue from the front.\n");
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

int dequeueRear() {
    int item;

    if (isEmpty()) {
        printf("Deque is empty. Cannot dequeue from the rear.\n");
        exit(EXIT_FAILURE);
    }

    item = array[rear];

    if (front == rear) {
        front = rear = -1;
    } else {
        rear = (rear - 1 + capacity) % capacity;
    }

    return item;
}

void display() {
    int i;
    if (isEmpty()) {
        printf("Deque is empty.\n");
        return;
    }

    printf("Deque elements: ");
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
    enqueueFront(1);
    enqueueRear(2);
    enqueueRear(3);

    display();

    printf("Dequeued from front: %d\n", dequeueFront());

    display();

    printf("Dequeued from rear: %d\n", dequeueRear());

    display();

    return 0;
}
