#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

struct node{
    int data;
    struct node* next;
};
struct node *head=NULL;

int creation(){
    struct node *p,*c;
    int data, choice=0;
    do{
        printf("Enter node data: ");
        scanf("%d",&data);
        c=(struct node*)malloc(sizeof(struct node));
        c->data=data;
        c->next=NULL;
        if(head==NULL){
            head=c;
            p=c;
        }
        else{
            p->next=c;
            p=c;
        }
        printf("(0/1): ");
        scanf("%d",&choice);
        if(choice!= 0 && choice!=1){
            printf("Invalid choice\n");
            return 0;
        }
    }while(choice==1);
}

int display(){
    if(head==NULL){
        printf("Linked list status : Empty!\n");
        return 0;
    }
    else{
        printf("\nCurrent Linked list:");
        struct node *ptr;
        ptr=head;
        while(ptr!=NULL){
            printf("%d ",ptr->data);
            ptr=ptr->next;
        }
        printf("\n");
        return 1;
    }
}

int reverse(int l, int r){
    if(display()==0){
        return 0;
    }
    display();
    struct node *prev = NULL,*current = head,*next = NULL;
    struct node *dummy = NULL;

    int c=0;
    if(l<0)
        return 0;
    if(r<0)
        return 0;
    while(c!=l-1){
        c++;
        current = current -> next;
        if(current==NULL){
            printf("not valid");
            return 0;
        }
    }

    while (current != NULL) {
        next = current -> next;
        if(c==l-1)
            dummy = current;
        else
            current -> next = prev;
        prev = current;
        current = next;
        if(++c==r)
            break;
    }
    if(c<r){
        printf("not valid");
        return 0;
    }
    dummy -> next = next;

    c=0;
    current = head;
    while(c!=l-1-1){
        c++;
        current = current -> next;
    }
    current -> next = prev;

    display();
    return 0;
}

int main() {
    int choice;
    int left,right;
    scanf("%d",&left);
    scanf("%d",&right);
    while(true){
        printf("\n1.Creation\t2.Display\t3.Reverse\t4.Exit\nEnter your choice: ");
        scanf("%d",&choice);
        
        switch(choice) {
            case 1: creation();
                    break;
            case 2: display();
                    break;
            case 3: reverse(left, right);
                    break;
            case 4: return 0;
            default : printf("Invalid choice\n");
            }
    }
}   