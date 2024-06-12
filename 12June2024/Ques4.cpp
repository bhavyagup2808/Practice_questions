#include <iostream>
#include <vector>
using namespace std;


vector<int> occurrencesOfElement(vector<int>& nums, vector<int>& queries, int x) {
        vector<int> ans(queries.size(),-1);
        vector<int> temp;
        for(int i=0;i<nums.size();i++)
        {
            if(nums[i]==x) temp.push_back(i);
        }
        for(int i=0;i<ans.size();i++)
        {
            if(queries[i]<=temp.size())
            {
                ans[i]=temp[queries[i]-1];
            }
        }
        return ans;
}
int main()
{
    vector<int>nums{1,3,1,7};
    vector<int> queries {1,3,2,4};
    int x=1;
    vector<int> ans=occurrencesOfElement(nums,queries,x);
    for(int i=0;i<ans.size();i++)
    {
        cout<<ans[i]<<" ";
    }
}