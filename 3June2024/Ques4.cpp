#include <iostream>
#include <vector>
using namespace std;

vector<vector<int>> ans;

void solve(vector<int>& arr, int target, int n, vector<int>& temp) {
    if (target == 0) {
        ans.push_back(temp);
        return;
    }
    if (n < 0 || target < 0) return;
    temp.push_back(arr[n]);
    solve(arr, target - arr[n], n - 1, temp);
    temp.pop_back(); 
    solve(arr, target, n - 1, temp);
}

int main() {
    vector<int> arr{1, 2, 3, 4, 5, 8};
    int target = 9;
    vector<int> temp;

    solve(arr, target, arr.size() - 1, temp);

    for (const auto& subset : ans) {
        for (int num : subset) {
            cout << num << " ";
        }
        cout << endl;
    }

    return 0;
}