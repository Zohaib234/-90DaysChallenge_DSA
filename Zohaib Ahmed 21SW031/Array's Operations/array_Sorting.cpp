#include<iostream>
using namespace std;



void display(int arr[],int n){

    for (int i = 0; i < n; i++)
    {
        cout<<arr[i]<<"  ";
    }
    
}

// sorting array using Bubble Sort
void Bubblesort(int arr[],int n){


    for (int  i = 0; i <n-2; i++)
    {
        for (int j = 0; j<= n-2-i; j++)
        {
          if (arr[j]>arr[j+1])

          {

            int temp = arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;

            
          }
          

        }
        
    }

     return;


    
}

// selection sort

void selectionSort(int arr[],int n){

    for (int  i = 0; i <n-2; i++)
    {
        int minIndex=i;
        for (int j = i+1; j <=n-1; j++)
        {
            if (arr[j]<arr[minIndex])
            {
            minIndex=j;
            }
            
        }
        int temp = arr[i];
        arr[i]=arr[minIndex];
        arr[minIndex]=temp;

        
    }
    return;
    

}


int main()
{

int arr [] = {10,2,8,7,6,3};
int size=6;

cout<<"before sorting"<<endl;
display(arr,size);

selectionSort(arr,size);

cout<<endl<<" after sorting "<<endl;

display(arr,size);




return 0;

}