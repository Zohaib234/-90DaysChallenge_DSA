#include <iostream>
using namespace std;
#define n 100

class stack
{

    int top;
    int *arr;

public:
    stack()
    {
        top = -1;
        arr = new int[n];
    }
    void push(int x)
    {
        if (top == n - 1)
        {
            cout << "Stack OverFlow";
        }
        top++;
        arr[top] = x;
    }
    void pul()
    {
        if (top == -1)
        {
            cout << "no element to Pop from Stack";
        }
        top--;
    }

    int Top()
    {
        return arr[top];
    }

    bool isEmpty()
    {
        return top == -1;
    }
    bool isFull()
    {
        return top == n - 1;
    }
};

int main()
{


stack s;
s.push(1);
s.push(2);
s.push(3);
s.push(4);
cout<< "before pull "<< s.Top();
s.pul();  
cout<<"\nafter pull "<<s.Top();
cout<<endl<<s.isFull();
    return 0;
}