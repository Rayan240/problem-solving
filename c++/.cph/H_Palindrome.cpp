#include<bits/stdc++.h>
using namespace std;
int main()
{
  int n;
    string str;
    cin>>str;
    string org=str;
    while(n--)
    {
      cin>>str;
      for(int i=str.length()-1;i>=0;i--)
      {
        str[i]=tolower(str[i]);
        if(org==str)
        {
          cout<<"YES"<<endl;
        }
        else{
          cout<<"NO";
        }
      }
    }
    return 0;
}   