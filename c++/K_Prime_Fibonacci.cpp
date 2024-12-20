#include<bits/stdc++.h>
using namespace std;
int main()
{
    int num,s;
    bool p=1;
    
    cin>>num;
   //s=sqrt(num);
    for(int i=1;i<=sqrt(num);i++)
    {
        if(num%i==0){
        cout<<"not-prime-number"<<endl;
        p=0;
        break;}
    }
    if(p==1){
    cout<<"prime-number"<<endl;
    }

    }
