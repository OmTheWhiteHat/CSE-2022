#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
/*This Programme is written by Om and Debu*/
union unionJob
{
	//defining a union
	char name[32];	
	float salary;
	int workerNo;
}uJob;
struct structJob
{
	char name[32];
	float salary;
	int workerNo;
} sJob;
int main()
{
    system("color 0b");
    int chos;
    printf("Choices:\n------------------------------\n  1.size of union\n------------------------------\n  2.size of structure\n------------------------------\n Enter your choice: ");
    scanf("%d",&chos);
    printf("\n");
       switch(chos)
       {
    	case 1:
    		system("color 0d");
    		printf("--------------------------------");
    		printf("\n  size of union = %d bytes",sizeof(uJob));
    		break;
    	case 2:
    		system("color 0a");
    		printf("--------------------------------");
    		printf("\n  size of structure = %d bytes",sizeof(sJob));
			break;
    	default:
    		system("color 0c");
    		printf("--------------------------------");
    		printf("\n  Invalid choice!");
        }
	return 0;
}

