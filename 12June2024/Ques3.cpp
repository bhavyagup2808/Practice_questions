#include <iostream>
#include <vector>
#include <map>
using namespace std;

int main()
{
    int limit=4;
    vector<vector<int>>& queries {{1,4},{2,5},{1,3},{3,4}};
    vector<int> QueryAnswers;
    map<int,int> ColorCount , BallColor;
    for(vector<int> &q : queries){
        int Ball = q[0] , NewColor = q[1];
        if(BallColor.count(Ball)){
            int OldColor = BallColor[Ball];
            if(--ColorCount[OldColor] == 0) 
                    ColorCount.erase(OldColor);
        }
        ColorCount[NewColor]++;
        BallColor[Ball] = NewColor;
        QueryAnswers.push_back(ColorCount.size());
    }
    for(int i=0;i<QueryAnswer.size();i++)
    {
        cout<<QueryAnswers[i]<<" ";
    }
}