#include <iostream>
using namespace std;

int linearSearch(int arr[], int length, int search_item);
int binarySearch(int arr[], int length, int search_item);

int main()
{
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    // leave the array sorted for binary search
    int search_item;
    cout << "enter the number to search : ";
    cin >> search_item;
    int length = sizeof(arr) / sizeof(arr[0]);
    linearSearch(arr, length, search_item);
    binarySearch(arr, length, search_item);
    return 0;
}

int linearSearch(int arr[], int length, int search_item)
{
    int i;
    for (i = 0; i < length; i++)
    {
        if (arr[i] == search_item)
        {
            cout << "found" << endl;
            return 0;
        }
    }
    cout << "not found" << endl;
    return 0;
}

int binarySearch(int arr[], int length, int search_item){
    int low=0,high=length-1,mid;
    while(true){
        mid=(low+high)/2;
        if(arr[mid]==search_item){
            cout<<"found"<<endl;
            return 0;
        }
        else if(arr[mid]<search_item){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
        if(low>high){
            cout<<"not found"<<endl;
            return 0;
        }
    }
}