
// algrothim for searching in arrays

// 1 lenear searching => searching element at every index
//  time complaxity is O(n)
// 2 Binary Searching = > searching by divinding array into mid point
//     time complaxity is O(logn)

#include <iostream>
using namespace std;

// code for linear search
 int linearSearch(int arr[], int size, int key)
{
    for (int i = 0; i < size; i++)
    {
        if (arr[i] == key)
        {
            return 1;
        }
    }
    return -1;
}

// code for binary search

int binarySearch(int arr[], int size, int key)
{
    int start = 0;
    int end = size;

    while (start<=end)
    {
    int mid = (start + end )/ 2;
        if (arr[mid] == key)
        {
            return mid;
        }
        else if (arr[mid] > key)
        {
            end = mid - 1;
        }
        else
        start = mid + 1;
    
    }

    return -1;
}

int main()
{
    int size;
    cout << "enter the size of array" << endl;
    cin >> size;
    int arr[size];
    for (int i = 0; i < size; i++)
    {
        cin >> arr[i];
    }

    int key;
    cout << "enter the element that you want to search" << endl;
    cin >> key;

    cout << binarySearch(arr, size, key);

    return 0;
}