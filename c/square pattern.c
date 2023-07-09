#include <stdio.h>

void print_pattern(int size) {
  int i, j, k, l, m;
  for (i = size; i >= 1; i--) {
    for (j = size; j > i; j--) {
      printf(" ");
    }
    for (k = i; k <= size; k++) {
      printf("%d ", k);
    }
    for (l = size - 1; l >= i; l--) {
      printf("%d ", l);
    }
    printf("\n");
  }
}

int main() {
  int size;
  printf("Enter size of square: ");
  scanf("%d", &size);
  print_pattern(size);
  return 0;
}
