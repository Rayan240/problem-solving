#include<bits/stdc++.h>
using namespace std;
int main()
{
    int num,sum=0,armstrong;
    cin>>num;
    int orginial=num;
    while(num>0)
    {
        armstrong=num%10;
        sum+=pow(armstrong,3);
        num=num/10;

    }
    if(orginial==sum){
    cout<<"armstrong"<<endl;
    }
    else
    {
        cout<<"not armstrong"<<endl;}
}
