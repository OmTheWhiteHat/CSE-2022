#include<stdio.h>
int main()
{
	int x=10,*p;
	p=&x;
//	system("color 0b");
	printf("\n The value of x=%d",x);
	printf("\n The value of x=%d",*p);
	printf("\n Address of x=%d",&x);
	printf("\n Address of x=%d",p);
	return 0;
}



