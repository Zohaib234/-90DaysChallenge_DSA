

/*
Recursion = recursion is a phenomena in which a function call itself to make the
            problem easier to solve

*/

#include <iostream>
using namespace std;

// Question 1 == add all numbers till n

int sum(int n)
{
    if (n == 0)
    {
        return 0;
    }
    int previous = sum(n - 1);
    return n + previous;
}

// question 2 == calculate n raise to power of p

int power(int n, int p)
{
    if (p == 0)
    {
        return 1;
    }

    int previous = n * power(n, p - 1);
    return  previous;
}

// question 3 =  calculate the factorial of n using recursion

int factorial(int n)
{
    if (n == 0)
    {
        return 1;
    }
    int fact = factorial(n - 1);
    return n * fact;
}

// question 4 == print nth fabonaccie number

int fab(int n){

    if(n==0 || n==1){
        return n;
    }

    return fab(n-1) + fab(n-2);

}

// question 5 == print numbers till n in decreasing order 

void dec(int n){

    if(n==0){
        return;
    }

    cout<<n<<" " <<endl;
    dec(n-1);
}


// question 6 == print numbers till n in increasing order
void inc(int n){

    if(n==0){
        return;
    }

    inc(n-1);
    cout<<n<<" " <<endl;
}
int main()
{

    // testing first question

    int n;
    cout << "enter number to print sum till  that number " << endl;
    cin >> n;
    cout << "sum till number " << n << " is  " << sum(n) << endl;

    
    // testing second question

    cout<<power(4,3)<<endl;

    // testing question third

    cout<<factorial(5)<<endl;

    // testing question fourth

    cout<<fab(4)<<endl;

    // testing question 5
    cout<<endl;

    dec(5);

    // testing question 6
   
   cout<<endl; 
   inc(5);
     


    return 0;
}