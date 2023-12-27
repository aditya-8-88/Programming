// // Linear Searching

// #include <stdio.h>

// int linearSearch(int arr[], int size, int key) {
//     for (int i = 0; i < size; ++i) {
//         if (arr[i] == key) {
//             return i;  // Return the index if the key is found
//         }
//     }
//     return -1;  // Return -1 if the key is not found
// }

// int main() {
//     int arr[] = {10, 25, 7, 42, 15, 8, 32};
//     int size = sizeof(arr) / sizeof(arr[0]);

//     int key = 15;
//     int result = linearSearch(arr, size, key);

//     if (result != -1) {
//         printf("Element %d found at index %d.\n", key, result);
//     } else {
//         printf("Element %d not found in the array.\n", key);
//     }

//     return 0;
// }










// // Binary Searching 
// #include <stdio.h>

// int binarySearch(int arr[], int left, int right, int key) {
//     while (left <= right) {
//         int mid = left + (right - left) / 2;

//         // Check if the key is present at the middle
//         if (arr[mid] == key) {
//             return mid;  // Return the index if the key is found
//         }

//         // If the key is greater, ignore the left half
//         if (arr[mid] < key) {
//             left = mid + 1;
//         }
//         // If the key is smaller, ignore the right half
//         else {
//             right = mid - 1;
//         }
//     }

//     return -1;  // Return -1 if the key is not found
// }

// int main() {
//     int arr[] = {7, 8, 10, 15, 25, 32, 42};
//     int size = sizeof(arr) / sizeof(arr[0]);

//     int key = 15;
//     int result = binarySearch(arr, 0, size - 1, key);

//     if (result != -1) {
//         printf("Element %d found at index %d.\n", key, result);
//     } else {
//         printf("Element %d not found in the array.\n", key);
//     }

//     return 0;
// }













// // Binary Searching through Recursion
// #include <stdio.h>

// int binarySearchRecursive(int arr[], int left, int right, int key) {
//     if (left <= right) {
//         int mid = left + (right - left) / 2;

//         // Check if the key is present at the middle
//         if (arr[mid] == key) {
//             return mid;  // Return the index if the key is found
//         }

//         // If the key is greater, search in the right half
//         if (arr[mid] < key) {
//             return binarySearchRecursive(arr, mid + 1, right, key);
//         }
//         // If the key is smaller, search in the left half
//         else {
//             return binarySearchRecursive(arr, left, mid - 1, key);
//         }
//     }

//     return -1;  // Return -1 if the key is not found
// }

// int main() {
//     int arr[] = {7, 8, 10, 15, 25, 32, 42};
//     int size = sizeof(arr) / sizeof(arr[0]);

//     int key = 15;
//     int result = binarySearchRecursive(arr, 0, size - 1, key);

//     if (result != -1) {
//         printf("Element %d found at index %d.\n", key, result);
//     } else {
//         printf("Element %d not found in the array.\n", key);
//     }

//     return 0;
// }



















// // Index Sequential Searching
// #include<stdio.h>

// int main() {
//     int i, j, l, start, end, target, found = 0;
//     int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 80, 90};

//     printf("Enter target: ");
//     scanf("%d", &target);

//     l = sizeof(arr) / sizeof(arr[0]);
//     printf("length=%d\n", l);

//     for (i = 0; i < l; i += 3) {
//         // printf("%d\n", i / 3);
//         start = i, end = i + 2;

//         if (end > l - 1)
//         end = l - 1;

//         if (target >= arr[start] && target <= arr[end]) {
//             for (j = start; j <= end; j++) {
//                 if (target == arr[j]) {
//                     printf("Found\n");
//                     found = 1;
//                     break; 
//                 }
//             }
//         }
//         if (found==1)
//         break;
//     }

//     if (!found)
//         printf("Not found\n");

//     return 0;
// }

