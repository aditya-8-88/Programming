#include <stdio.h>

void towerOfHanoi(int n, char S, char T, char D)
{
	if (n == 1)
	{
		printf("\n Move disk 1 from rod %c to rod %c", S, D);
		return;
	}
	towerOfHanoi(n-1, S, D, T);
	towerOfHanoi(1, S, T, D);
	towerOfHanoi(n-1, T, S, D);
}

int main()
{
	int n = 3;
	towerOfHanoi(n, 'S', 'T', 'D');
	return 0;
}