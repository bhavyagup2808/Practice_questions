#include <iostream>
#include <unordered_set>
using namespace std;

    int longestPalindrome(string s) {
        unordered_set <char> charSet;
        int length = 0;
        for (char c : s) {
            if (charSet.find(c) != charSet.end()) {
                charSet.erase(c);
                length += 2;
            } else {
                charSet.insert(c);
            }
        }
        if(charSet.size()!=0)return length+1;
        return length;
    }

int main()
{
    string s = "abccccdd";
     int ans =longestPalindrome(s);
     cout<<ans<<" ";
}