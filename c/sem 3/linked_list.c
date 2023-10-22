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
        printf("Enter 1 for new data entry or 0 vica-versa: ");
        scanf("%d",&choice);
        if(choice!= 0 && choice!=1){
            printf("Invalid choice\n");
            return 0;
        }
    }while(choice==1);
}

int display(){
    printf("\nLinked list:");
    if(head==NULL){
        printf("You haven't created a list yet!\n");
        return 0;
    }
    else{
        struct node *ptr;
        ptr=head;
        while(ptr!=NULL){
            printf("%d ",ptr->data);
            ptr=ptr->next;
        }
        printf("\n");
    }

}

int insertion(){
    // printf("")
    display();
    struct node *ptr,*c,*p;
    int data,target;
    ptr=(struct node*)malloc(sizeof(struct node));
    printf("Enter data and target for new node creation: ");
    scanf("%d %d",&ptr->data,&target);
    target++;
    c=head;
    while(target){
        if(target==1){
            ptr->next=head;
            head=ptr;
            return 0;
        }
        if(c->next==NULL){
            c->next=ptr;
            ptr->next=NULL;
            return 0;
        }
        p=c;
        c=c->next;
        target--;
    }
    ptr->next=c;
    p->next=ptr;
    display()
}

int main() {
    int choice;
    while(true){
        printf("\n1.Creation\t2.Insertion\t3.Deletion\t4.Display\t5.Exit\nEnter your choice: ");
        scanf("%d",&choice);
        switch(choice) {
            case 1: creation();
                    break;
            case 2: insertion(); 
                    break;
            // case 3: deletion(); 
            //         break;
            case 4: display();
                    break;
            case 5: return 0;
            default : printf("Invalid choice\n");
            }
    }
}