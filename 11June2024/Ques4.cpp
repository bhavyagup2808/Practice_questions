// You are given two integers n and k.
// Initially, you start with an array a of n integers where a[i] = 1 for all 0 <= i <= n - 1. After each second, you simultaneously update each element to be the sum of all its preceding elements plus the element itself. For example, after one second,
// a[0] remains the same, a[1] becomes a[0] + a[1], a[2] becomes a[0] + a[1] + a[2], and so on.
// Return the value of a[n - 1] after k seconds.
// Since the answer may be very large, return it modulo 109 + 7.
#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int main()
{
    int n=4,k=5;
    vector<int> a(n, 1);
        int MOD = 1000000007;
        for(int i=1;i<=k;i++)
        {
            long long int sum=0;
            for(int j=0;j<a.size();j++)
            {
                sum =(sum+a[j])%MOD;
                a[j]=sum;
            }
        }
    cout<<a[n-1]<<" ";
}