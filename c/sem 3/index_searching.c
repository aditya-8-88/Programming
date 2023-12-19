// #include<stdio.h>
// int main(){
//     int i,j,l,start,end,target,flag=0;
//     int arr[]={0,1,2,  3,4,5,  6,7,8,  9};
//     // int arr[]={0,1};

//     printf("Enter: ");
//     scanf("%d",&target);

//     l=sizeof(arr)/sizeof(arr[0]);
//     printf("length=%d\n",l);

//     for(i=0;i<l;i+=3){
//         printf("%d\n",i/3);
//         start=i,end=i+2;

//         if (end>l-1)
//         end=l-1;

//         if(target >= arr[start] && target<=arr[end]){
//             for(j=start;j<=end;j++){
//                 if(target==arr[j])
//                 flag=1;
//                 break;
//             }
//         }
//         if(flag==1)
//         break;
//     }
//     printf("Result: %s\n", (flag ? "Found" : "Not Found"));
// }

        
#include<stdio.h>

int main() {
    int i, j, l, start, end, target, found = 0;
    int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 80, 90};

    printf("Enter target: ");
    scanf("%d", &target);

    l = sizeof(arr) / sizeof(arr[0]);
    printf("length=%d\n", l);

    for (i = 0; i < l; i += 3) {
        // printf("%d\n", i / 3);
        start = i, end = i + 2;

        if (end > l - 1)
        end = l - 1;

        if (target >= arr[start] && target <= arr[end]) {
            for (j = start; j <= end; j++) {
                if (target == arr[j]) {
                    printf("Found\n");
                    found = 1;
                    break; 
                }
            }
        }
        if (found==1)
        break;
    }

    if (!found)
        printf("Not found\n");

    return 0;
}
