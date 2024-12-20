#include<iostream>
#include<cmath>
using namespace std;
int main()
{
    int num,p=1;
    
    cin>>num;
    for(int i=2;i<=sqrt(num);i++)
    {
        if(num%i==0){
        cout<<"not prime number"<<endl;
        p=0;
        break;}
    }
    if(p==1){
    cout<<"prime number"<<endl;}

    }
