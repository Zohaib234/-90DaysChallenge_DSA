


/*
 Linked List == linked list is also lenear type of data structure like array
                but it's very different to array  


*/

#include<iostream>
using namespace std;

// declaring a Linked List

struct Node
{
    int data;
    struct Node* next;
};

// tarvsersing a linked LIst 

void travers(struct Node  *ptr){

while ( ptr!=NULL)
{
   cout<<ptr->data << " -> " ;
   ptr = ptr->next;
}
cout<<endl;
}

int main()
{
    // creation of node
struct Node*  head;

struct Node*  first  = new struct Node();
struct Node* second  = new struct Node();
head = first;
first->data=7;
first->next=second;

second->data=11;
second->next=NULL;

travers(head);
return 0;


}