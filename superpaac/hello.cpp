#include<bits/stdc++.h>
using namespace std;

void perm(vector<int>a,vector<int>b,int res)
{
    if(a.size() == 0)
    return;
for(int i = 0;i<a.size()-1;i++ )
{
  if(abs(a[i]) - abs(a[i+1]) <=2)
  {
    res =res+ b[i];
    cout<<res<<endl;
  }
  perm(vector<int>(a.begin()+i+1,a.end()),vector<int>(b.begin()+i+1,b.end()),res);
}
}
using namespace std;
int main()
{
    vector<int>a={-1,-2,-3,4,3,2,1};
    vector<int>b={4,6,2,3,8,4,5};
    int res =0;
    perm(a,b,0);
}