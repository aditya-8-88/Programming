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

int insertion(){
    if(display()==0){
        return 0;
    }
    struct node *ptr,*c,*p;
    c=head;
    int data,target,temp=1;
    ptr=(struct node*)malloc(sizeof(struct node));
    printf("Enter target and data for new node creation, enter 0 to add at last: ");
    scanf("%d %d",&target,&ptr->data);
    if(target==1){// head case
        ptr->next=head;
        head=ptr;
        display();
        return 0;
    }
    else if(target==0){// NULL case or tail case
        while(c->next!=NULL){
            c=c->next;
        }
        c->next=ptr;
        ptr->next=NULL;
        display();
        return 0;
    }
    while(temp!=target){// any middle case
        p=c;
        c=c->next;
        temp++;
    }
    p->next=ptr;
    ptr->next=c;
    display();
    return 0;
}

int deletion(){
    if(display()==0){
        return 0;
    }
    struct node *p2=NULL,*p1=head;
    int target,temp=1;//imp-> value of temp should decrease on incrementing the number of pointer used
    printf("-1.Delete the linked list\t0.Tail\t1.Head\tany other number for other deletion.\nDeletion Operation: ");
    scanf("%d",&target);
    if(target==1){
        head=p1->next;
        free(p1);
        display();
        return 0;
    }
    else if(target==0){
        while(p1->next!=NULL){            
            p2=p1;
            p1=p1->next;
            }
            p2->next=NULL;
            free(p1);
            display();
            return 0;
    }
    else if(target==-1){
        while(p1!=NULL){
            p2=p1;
            p1=p1->next;
            free(p2);
        }
        head=NULL;
        display();
        return 0;
    }
    while(p1 != NULL && temp!=target){
        // p3=p2;
        p2=p1;
        p1=p1->next;
        temp++;
    }
    p2->next=p1->next;
    free(p1);
    display();
    return 0;
}

int reverse(){
    if(display()==0){
        return 0;
    }
    display();
    struct node *prev = NULL,*current = head,*next = NULL;
    while (current != NULL) {
        next = current -> next;
        current -> next = prev;
        prev = current;
        current = next;
    }
    head = prev;
    display();
    return 0;
}
int main() {
    int choice;
    while(true){
        printf("\n1.Creation\t2.Insertion\t3.Deletion\t4.Display\t5.Reverse\t6.Exit\nEnter your choice: ");
        scanf("%d",&choice);
        switch(choice) {
            case 1: creation();
                    break;
            case 2: insertion(); 
                    break;
            case 3: deletion(); 
                    break;
            case 4: display();
                    break;
            case 5: reverse();
                    break;
            case 6: return 0;
            default : printf("Invalid choice\n");
            }
    }
}   