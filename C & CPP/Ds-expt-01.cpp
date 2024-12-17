#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
main(void)
{
system("color 0c");

int arr[5],i;
arr[0]=10;
arr[1]=20;
arr[2]=30;
arr[3]=40;
arr[4]=50;

   printf("Value in array arr[0]:%d\n",arr[0]);
   printf("Value in array arr[1]:%d\n",arr[1]);
   printf("Value in array arr[2]:%d\n",arr[2]);
   printf("Value in array arr[3]:%d\n",arr[3]);
   printf("Value in array arr[4]:%d\n",arr[4]);
   printf("\n");
   
     for(i=0;i<5;i++)
     
      {
      	printf("Value in array arr[%d]:%d\n",i,arr[i]);
      }
      getch();
	  }
   