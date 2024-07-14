#include <stdio.h>

// Function declarations
int linearSearch(int arr[], int size, int key);
int binarySearch(int arr[], int left, int right, int key);
int binarySearchRecursive(int arr[], int left, int right, int key);
void indexSequentialSearch(int arr[], int target);

int main()
{
    int choice, key, result;
    int arr[] = {7, 8, 10, 15, 25, 32, 42, 80, 90};
    int size = sizeof(arr) / sizeof(arr[0]);
    do
    {
        printf("\nMenu:\n");
        printf("1. Linear Search\n");
        printf("2. Binary Search\n");
        printf("3. Binary Search (Recursive)\n");
        printf("4. Index Sequential Search\n");
        printf("0. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            printf("Enter the key: ");
            scanf("%d", &key);
            result = linearSearch(arr, size, key);
            if (result != -1)
                printf("Element %d found at index %d.\n", key, result);
            else
                printf("Element %d not found in the array.\n", key);
            break;
        case 2:
            printf("Enter the key: ");
            scanf("%d", &key);
            result = binarySearch(arr, 0, size - 1, key);
            if (result != -1)
                printf("Element %d found at index %d.\n", key, result);
            else
                printf("Element %d not found in the array.\n", key);
            break;
        case 3:
            printf("Enter the key: ");
            scanf("%d", &key);
            result = binarySearchRecursive(arr, 0, size - 1, key);
            if (result != -1)
                printf("Element %d found at index %d.\n", key, result);
            else
                printf("Element %d not found in the array.\n", key);
            break;
        case 4:
            printf("Enter the target: ");
            scanf("%d", &key);
            indexSequentialSearch(arr, key);
            break;
        case 0:
            printf("Exiting the program.\n");
            break;
        default:
            printf("Invalid choice. Please enter a valid option.\n");
        }
    } while (choice != 0);
    return 0;
}

int linearSearch(int arr[], int size, int key)
{
    for (int i = 0; i < size; ++i)
    {
        if (arr[i] == key)
            return i;
    }
    return -1;
}

int binarySearch(int arr[], int left, int right, int key)
{
    while (left <= right)
    {
        int mid = left + (right - left) / 2;
        if (arr[mid] == key)
            return mid;
        if (arr[mid] < key)
            left = mid + 1;
        else
            right = mid - 1;
    }
    return -1;
}

int binarySearchRecursive(int arr[], int left, int right, int key)
{
    if (left <= right)
    {
        int mid = left + (right - left) / 2;
        if (arr[mid] == key)
            return mid;
        if (arr[mid] < key)
            return binarySearchRecursive(arr, mid + 1, right, key);
        else
            return binarySearchRecursive(arr, left, mid - 1, key);
    }
    return -1;
}

void indexSequentialSearch(int arr[], int target)
{
    int i, j, l, start, end, found = 0;
    l = sizeof(arr) / sizeof(arr[0]);
    for (i = 0; i < l; i += 3)
    {
        start = i;
        end = i + 2;

        if (end > l - 1)
            end = l - 1;

        if (target >= arr[start] && target <= arr[end])
        {
            for (j = start; j <= end; j++)
            {
                if (target == arr[j])
                {
                    printf("Element %d found at index %d.\n", target, j);
                    found = 1;
                    break;
                }
            }
        }
        if (found == 1)
            break;
    }

    if (!found)
        printf("Element %d not found in the array.\n", target);
}