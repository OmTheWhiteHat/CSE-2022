#include<Stdio.h>
#include<Stdlib.h>
#define  MAX_SIZE 100
/*
This Program is written By Om Prakash & Debabrata ...
*/
int stack[MAX_SIZE];
void push(int value);
int pop();
void traverse();
int is_empty();
int top_element();
int top=-1;

int main()
{
	system("color 0b");
	int element,choice;
	while(1)
	{
		printf("Stack Operation.\n");
		printf("1. Insert into stack(Push operation).\n");
		printf("2. Delete from stack(Pop operation).\n");
		printf("3. Print  top element of stack.\n");
		printf("4. Check if stack is empty.\n");
		printf("5. Traverse stack.\n");
		printf("6. Exit.\n");
		printf("Enter your choice: ");
		scanf("%d",&choice);
		system("cls");
		switch(choice)
		{
			case 1:
				if(top==MAX_SIZE-1)
				{
					system("color 0c");
				printf("Error:Overflow\n\n");
				}
				else
				{
					system("color 0a");
					printf("Enter the value to insert.\n");
					scanf("%d",&element);
					push(element);
				}
				break;
				case 2:
					if(top==-1)
					{
						system("color 0a");
					printf("Error:Underflow.\n\n");
					}
					else
					{
						system("color 0c");
						element=pop();
						printf("Element removed from stack is %d.\n",element);	
					}
					break;
				case 3:
						if(!is_empty())
						{
							system("color 0b");
							element=top_element();
							printf("Element at the top of stack is %d\n\n",element);
						}
						else
						{
							system("color 0a");
							printf("Stack is empty.\n\n");
						}
				break;
				case 4:
					if(is_empty())
					{
					system("color 0a");
					printf("Stack is empty.\n\n");
					}
					else
					{
					system("color 0c");
					printf("Stack is not empty.\n\n");
					}
				break;
				case 5:
					traverse();
				break;
				case 6:
					exit(0);
		}
	}
}
						
void push(int value)
	{
		top++;
		stack[top]=value;
	}
int pop()
{
		int element;
	if(top==-1)
		return top;
	else
	{
		element=stack[top];
		top--;
		return element;
	}
}
void traverse()
{
	int d;
	if(top==-1)
	{
		system("color 0a");
		printf("Stack is empty.\n\n");
	}
	system("color 0b");
	printf("There are %d elements in stack.\n",top+1);
	for(d=top;d>=0;d--)
	{
	printf("%d\n",stack[d]);
	}
	printf("\n");
}
int is_empty()
	{
	if(top==-1)
		return 1;
		else
		return 0;
	}
int top_element()
{
    return stack[top];
}
