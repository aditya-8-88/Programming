#include <iostream>
using namespace std;

int bubbleSort(int arr[], int length);
int selectionSort(int arr[], int length);
int insertionSort(int arr[], int length);
int merge(int arr[], int left, int mid, int right);
int mergeSort(int arr[], int left, int right);
// int heapSort(int arr[], int length);
// int quickSort(int arr[], int length);
int display(int arr[], int length);

int main()
{
    int originalArr[] = {1, 23, 3, 4, 53, 26, 73, 18, 19, 1};
    int length = sizeof(originalArr) / sizeof(originalArr[0]);
    int arr[length];
    copy(originalArr, originalArr + length, arr);
    bubbleSort(arr, length);
    selectionSort(arr, length);
    insertionSort(arr, length);
    mergeSort(arr, 0, length - 1);
    display(arr, length);
    // heapSort(arr, length);
    // quickSort(arr, length);
    return 0;
}

int display(int arr[], int length)
{
    for (int i = 0; i < length; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;
    return 0;
}

int bubbleSort(int arr[], int length)
{
    for (int i = 0; i < length; i++)
    {
        for (int j = 0; j < length - i - 1; j++)
        {
            if (arr[j] > arr[j + 1])
            {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
    display(arr, length);
    return 0;
}

int selectionSort(int arr[], int length)
{
    for (int i = 0; i < length - 1; i++)
    {
        int min = i;
        for (int j = i + 1; j < length; j++)
        {
            if (arr[j] < arr[min])
            {
                min = j;
            }
        }
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }
    display(arr, length);
    return 0;
}

int insertionSort(int arr[], int length)
{
    for (int i = 1; i < length; i++)
    {
        int temp = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > temp)
        {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = temp;
    }
    display(arr, length);
    return 0;
}
 
int merge(int arr[], int left, int mid, int right)
{
    int i, j, k;
    int n1 = mid - left + 1;
    int n2 = right - mid;
    int L[n1], R[n2];
    for (i = 0; i < n1; i++)
    {
        L[i] = arr[left + i];
    }
    for (j = 0; j < n2; j++)
    {
        R[j] = arr[mid + 1 + j];
    }
    i = 0;
    j = 0;
    k = left;
    while (i < n1 && j < n2)
    {
        if (L[i] <= R[j])
        {
            arr[k] = L[i];
            i++;
        }
        else
        {
            arr[k] = R[j];
            j++;
        }
        k++;
    }
    while (i < n1)
    {
        arr[k] = L[i];
        i++;
        k++;
    }
    while (j < n2)
    {
        arr[k] = R[j];
        j++;
        k++;
    }
    return 0;
}
int mergeSort(int arr[], int left, int right)
{
    if (left < right)
    {
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }
    return 0;
}