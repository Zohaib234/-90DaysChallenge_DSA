#include<iostream>
using namespace std;

class Node {

    public:
    int data;
    Node* next;

    
    Node(int data){
        this->data=data;
        this->next=NULL;
    }

};

void display(Node* head){

    if (head==NULL)
    {
        cout<<"linked list is empty";
        return;
    }
    
   while (head !=NULL)
   {
     cout<<head->data << " -> ";
     head = head->next;
   }

   cout<<" NULL ";
   
    
}

int main()
{

Node* head = NULL;
Node* first  = new Node(5);
head = first;

Node* second = new Node(10);
first->next=second;
second->next=NULL;
// Node* third  = new Node(15);
// head=first;
// first->next = second;
// second->next= third;

display(head);

return 0;

}