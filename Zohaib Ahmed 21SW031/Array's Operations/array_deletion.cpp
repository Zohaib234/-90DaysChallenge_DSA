#include<iostream>
using namespace std;

void deletion(int arr [] ,  int size, int index){

    for (int  i = index; i < size-1; i++)
    {
        arr[i]= arr[i+1];
    }
    

}
void display(int arr[],int index){
    for (int i = 0; i < index; i++)
    {
        cout<<arr[i] << " ";
    }
    cout<<endl;
    
}
int main()
{

int arr [100]={1,2,3,4};
int size=4,capacity=100;
int index; 
display(arr,size);
cout<<"enter the index that you want to delete it's value  ";
cin>>index;

cout<<"after deletion";
deletion(arr,size,index);
size-=1;
display(arr,size);


return 0;
}