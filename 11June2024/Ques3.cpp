#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;
// Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.

// Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2.
//  Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.

vector<int> relativeSortArray(vector<int>& arr1, vector<int>& arr2) {
    int k=0;
    for(int i=0;i<arr2.size();i++)
    {
        for(int j=0;j<arr1.size();j++)
        {
            if(arr1[j]==arr2[i])
            {
                swap(arr1[j],arr1[k++]);
            }
        }
    }
    if(k<arr1.size())sort(arr1.begin()+k,arr1.end());
    return arr1;
}

int main()
{
    vector<int>ans=relativeSortArray(vector<int> arr1{28,6,22,8,44,17}, vector<int>& arr2{22,28,8,6});
    for (int i = 0; i < ans.size(); i++)
    {
        cout<<ans[i]<<" ";
    }
    
}