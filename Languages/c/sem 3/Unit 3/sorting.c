#include <stdio.h>
#include <stdlib.h>

void display(int arr[], int n)
{
    for (int i = 0; i < n; i++)
        printf("%d ", arr[i]);
}

int insertionSort(int arr[], int n)
{
    int i, j, temp;
    for (i = 1; i < n; i++)
    {
        temp = arr[i];
        for (j = i - 1; j >= 0; j--)
        {
            if (arr[j] > temp)
            {
                arr[j + 1] = arr[j];
                arr[j] = temp;
            }
        }
    }
    display(arr, n);
}

int bubbleSort(int arr[], int n)
{
    int i, j, temp;
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < n - 1 - i; j++)
        {
            if (arr[j] > arr[j + 1])
            {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
    display(arr, n);
}

int selectionSort(int arr[], int n)
{
    int i, j, temp;
    for (i = 0; i < n; i++)
    {
        for (j = i + 1; j < n; j++)
        {
            if (arr[i] > arr[j])
            {
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
    }
    display(arr, n);
}

int mergeSort(int arr[], int n){
    
    
}

void main()
{
    char flag;
    int sortChoice, size, arr[100], i;

    printf("Do you what to enter custom array yes[y]/no[n]: ");
    scanf("%c", &flag);
    if (flag == 'y')
    {
        printf("Enter the size of the array : ");
        scanf("%d", &size);
        printf("Enter array : ");
        for (i = 0; i < size; i++)
        {
            scanf("%d", &arr[i]);
        }
    }
    else
    {
        int defaultArray[] = {2, 1, 40, 30, 6, 5};
        size = sizeof(defaultArray) / sizeof(defaultArray[0]);
        for (i = 0; i < size; i++)
        {
            arr[i] = defaultArray[i];
        }
    }
    printf("Choose a sorting technique : \n1.Insertion sort\t2.Bubble sort\t3.Selection sort\n");
    scanf("%d", &sortChoice);
    switch (sortChoice)
    {
    case 1:
        insertionSort(arr, size);
        break;
    case 2:
        bubbleSort(arr, size);
        break;
    case 3:
        selectionSort(arr, size);
        break;
    case 4:
        mergeSort(arr,size);
        break;
    }
}