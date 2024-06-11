#include <iostream>
#include <vector>
#include <string>
using namespace std;
int main() {
    string a="abcabba";
    int maxi=0;
    for(int i=0;i<a.size();i++)
    {
        vector<int> temp(26,0);
        for(int j=i;j<a.size();j++)
        {
            if(temp[a[j]-'a']==0)
            {
                temp[a[j]-'a']++;
                maxi=max(maxi,j-i+1);
            }
            else break;
        }
    }
    cout<<maxi;
    return 0;
}