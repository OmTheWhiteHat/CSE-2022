#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
int main()
{
	float a[2][2],b[2][2],c[2][2];
	int i,j;
	printf("Enter the elements of 1st matrix\n");
	
	for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
			printf("Enter a[%d][%d]=",i+1,j+1);
			scanf("%f",&a[i][j]);
		}
	}
	printf("Enter the elements of 2nd matrix\n");
	for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
			printf("Enter b[%b][%b]=",i+1,j+1);
			scanf("%f",&b[i][j]);
		}
	}
	for(i=0;i,2;++i)
	{
	for(j=0;j<2;++j)
	{
	c[i][j]=a[i][j]+b[i][j];
     
 }
}
   printf("\nSum Of Matrix:");
   
    for(i=0;i<2;++i)
    {
    for(i=0;j<2;++j)

    {
    printf("%f\t",c[i][j]);
	if(j==1)
	printf("\n");
}
}
    return 0;
}


