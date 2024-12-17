//include iostream library to perform input and output operations
#include <iostream>

//use the standard namespace
using namespace std;

//declare some global variables to store user information and balance
string name, password;
double balance;

//create a function to display the menu and get the user choice
int menu() {
  //display the menu and ask the user to choose an option
  cout << "Please choose an option:\n";
  cout << "1. Withdraw\n";
  cout << "2. Deposit\n";
  cout << "3. Check balance\n";
  cout << "4. Exit\n";

  //declare a variable to store the user choice
  int choice;

  //get the user choice and validate it
  cin >> choice;
  while(choice < 1 || choice > 4) {
    cout << "Invalid option! Please enter a valid option:\n";
    cin >> choice;
  }

  //return the user choice
  return choice;
}

//create a function to perform the withdrawal operation
void withdraw() {
  //declare a variable to store the amount to withdraw
  double amount;

  //ask the user to enter the amount to withdraw and validate it
  cout << "Please enter the amount to withdraw:\n";
  cin >> amount;
  while(amount < 0 || amount > balance) {
    cout << "Invalid amount! Please enter a valid amount:\n";
    cin >> amount;
  }

  //update the balance and display a confirmation message
  balance -= amount;
  cout << "Withdrawal successful! Your new balance is: " << balance << "\n";
}

//create a function to perform the deposit operation
void deposit() {
  //declare a variable to store the amount to deposit
  double amount;

  //ask the user to enter the amount to deposit and validate it
  cout << "Please enter the amount to deposit:\n";
  cin >> amount;
  while(amount < 0) {
    cout << "Invalid amount! Please enter a valid amount:\n";
    cin >> amount;
  }

  //update the balance and display a confirmation message
  balance += amount;
  cout << "Deposit successful! Your new balance is: " << balance << "\n";
}

//create a function to display the balance
void checkBalance() {
  //display the current balance
  cout << "Your current balance is: " << balance << "\n";
}

//create a function to exit the program
void exit() {
  //display a farewell message and end the program
  cout << "Thank you for using the ATM system! Have a nice day!\n";
  exit(0);
}

//create a function to check the user login credentials
bool checkLogin(string name, string password) {

  //create some dummy data to simulate a database
  string names[] = {"Om", "Debu", "Abhisek"};
  string passwords[] = {"1234", "5678", "9012"};
  double balances[] = {1000, 2000, 3000};

  //loop through the database and compare the user credentials
  for(int i = 0; i < 3; i++) {
    if(name == names[i] && password == passwords[i]) {
      //if the credentials match, set the balance and return true
      balance = balances[i];
      return true;
    }
  }

  //if the credentials do not match, return false
  return false;
}

//create the main function
int main() {

  //display a welcome message and ask the user to enter their name and password
  cout << "Welcome to the ATM system!\n";
  cout << "Please enter your name:\n";
  cin >> name;
  cout << "Please enter your password:\n";
  cin >> password;

  //call the checkLogin function to verify the user credentials
  bool login = checkLogin(name, password);

  //if the login is successful, call the menu function and perform the corresponding operation
  if(login) {
    cout << "Login successful!\n";
    int choice = menu();
    switch(choice) {
      case 1:
        withdraw();
        break;
      case 2:
        deposit();
        break;
      case 3:
        checkBalance();
        break;
      case 4:
        exit();
        break;
    }
  }
  //if the login is not successful, display an error message and end the program
  else {
    cout << "Login failed!\n";
    cout << "Please try again later.\n";
  }

  //return 0 to indicate successful termination
  return 0;
}
