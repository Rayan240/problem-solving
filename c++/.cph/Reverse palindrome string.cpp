#include<bits/stdc++.h>
using namespace std;
int main()
{
    string str;
    char orginial;
    cin>>str;
    orginial=str;
    for(int i=str.length()-1;i>=0;i--)
    {
        if(str[i=='a'&& str[i]=='z']){
            if(orginial==str){
        cout<<"it's palindrome number"<<endl;
            }
            else{
                cout<<"not palindrome";
            }
        }
    }
}