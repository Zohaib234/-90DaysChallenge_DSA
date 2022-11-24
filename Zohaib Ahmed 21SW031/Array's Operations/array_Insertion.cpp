#include<iostream>
using namespace std;


// traversing of an array

void display(int arr[],int index){
    for (int i = 0; i < index; i++)
    {
        cout<<arr[i] << " ";
    }
    cout<<endl;
    
}

// insertion of element in  array at specific index

void insertion(int arr[] , int size, int index, int value){
    for (int i = size-1; i>index; i--)
    
    {
        arr[i+1] = arr[i];
    }

    arr[index]=value;

}


int main()
{

int arr [100]={1,2,3,4,5,6};
// before insertion
 cout<<"before insertion"<<endl;
display(arr,6);
 cout<<"after insertion"<<endl;
 insertion(arr,6,2,11);
display(arr,7);

return 0;


}