#include <stdio.h>
#define MAX 20
#include<stdlib.h>
int queue_array[MAX];
int rear = - 1;
int front = - 1;

void insert()
{
      int item;
      if (rear == MAX - 1)
            printf("Queue Overflow \n");
      else
      {
            if (front == - 1)
        	front = 0;
            printf("\nInsert the elment to queue : ");
            scanf("%d", &item);
            rear = rear + 1;
            queue_array[rear] = item;
      }
}
void delete1()
{
      if (front == - 1 || front > rear)
      {
            printf("Queue Underflow \n");
            return ;
      }
      else
      {
            printf("\nElement deleted from queue is : %d\n", queue_array[front]);
            front = front + 1;
      }
}
void display()
{
      int i;
      if (front == - 1 || front > rear)
      {
            printf("Queue is empty \n");
	  }
      else
      {
            printf("\nQueue is : ");
            for (i = front; i <= rear; i++)
            {
            	printf("%d ", queue_array[i]);
			}
			printf("\n");
      }
}
int main()
{
	system("color 0b");
	int ex;
      int ch;
      while (1)
      {
      	printf("\n******Welcome to Queue Program******\n");
      	printf("1. Insert element to queue\n");
      	printf("2. Delete element from queue\n");
      	printf("3. Display all elements of queue\n");
      	printf("4. Quit \n");
        printf("Enter your choice : ");
        scanf("%d", &ch);
        system("cls");
            switch(ch)
            {
                  case 1:
                  	system("color 0a");
                        insert();
                        break;
                  case 2:
                  	system("color 0c");
                        delete1();
                        break;
                  case 3:
                  	system("color 0a");
                        display();
                        break;
                  case 4:
                  	system("color 0a");
                    printf("Press 1 for quit: ");
                    scanf("%d",&ex);
                    switch(ex)
                    {
                    	case 1:
                    		exit(1);
                    	    break;
					}
                  default:
                  	system("color 0c");
                        printf("Invalid operation \n");
            }
      }
      return 0;
}
