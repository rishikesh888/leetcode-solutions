#include<bits/stdc++.h>
 using namespace std;
int main()
{
  int d,a,b;
  cin>>d;
  char p,q;
  cin>>p>>q;
  cin>>a>>b;
  
  long long ans=d,z=q-p+1;
  z*=z;
  long long m=b-a+1;
  m=m*m*m*m;
  ans*=z*m;
  cout<<ans;
  return 0;
}
  