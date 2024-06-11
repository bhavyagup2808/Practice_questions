#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;
vector<vector<int>>ans;
void permutation(vector<int> arr,int idx)
{
    if(idx==arr.size())
    {
        ans.push_back(arr);
        return;
    }
    for (int i = idx; i < arr.size(); i++)
    {
        swap(arr[i],arr[idx]);
        permutation(arr,idx+1);
        swap(arr[i],arr[idx]);
    }
    return;
}

int main()
{
    vector<int> arr{1,2,3};
    permutation(arr,0);
    for(int i=0;i<ans.size();i++)
    {
        for(int j=0;j<ans[i].size();j++)
        {
            cout<<ans[i][j]<<" ";
        }
        cout<<endl;
    }
}