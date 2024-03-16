#include <stdio.h>
#include <stdlib.h>

// Node structure
struct Node {
    int data;
    struct Node* next;
};

// Function to insert a new node at the beginning of the linked list
void insertAtBeginning(struct Node** head_ref, int new_data) {
    // Allocate memory for new node
    struct Node* new_node = (struct Node*)malloc(sizeof(struct Node));
    // Set data of new node
    new_node->data = new_data;
    // Set next of new node as current head
    new_node->next = *head_ref;
    // Move the head to point to the new node
    *head_ref = new_node;
}

// Function to delete a node with given key from the linked list
void deleteNode(struct Node** head_ref, int key) {
    // Store head node
    struct Node* temp = *head_ref, *prev;

    // If head node itself holds the key to be deleted
    if (temp != NULL && temp->data == key) {
        *head_ref = temp->next; // Change head
        free(temp); // Free old head
        return;
    }

    // Search for the key to be deleted, keep track of the previous node
    while (temp != NULL && temp->data != key) {
        prev = temp;
        temp = temp->next;
    }

    // If key was not present in the linked list
    if (temp == NULL) return;

    // Unlink the node from linked list
    prev->next = temp->next;

    // Free memory
    free(temp);
}

// Function to print the linked list
void printList(struct Node* node) {
    while (node != NULL) {
        printf("%d ", node->data);
        node = node->next;
    }
    printf("\n");
}

// Main function
int main() {
    // Initialize empty linked list
    struct Node* head = NULL;

    // Insert elements
    insertAtBeginning(&head, 5);
    insertAtBeginning(&head, 4);
    insertAtBeginning(&head, 3);
    insertAtBeginning(&head, 2);
    insertAtBeginning(&head, 1);

    // Print the linked list
    printf("Linked list: ");
    printList(head);

    // Delete an element
    deleteNode(&head, 3);

    // Print the updated linked list
    printf("Linked list after deletion: ");
    printList(head);

    return 0;
}


struct node{
    int data;
    struct node *next;
    struct node *prev;
};
