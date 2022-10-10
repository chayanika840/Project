#include <bits/stdc++.h>
using namespace std;
queue<int> modifyQueue(queue<int> q, int k);
int main()
{
    int t;
    cin >> t;
    while (t-- > 0)
    {
        int n, k;
        cin >> n >> k;
        queue<int> q;
        while (n-- > 0)
        {
            int a;
            cin >> a;
            q.push(a);
        }
        queue<int> ans = modifyQueue(q, k);
        while (!ans.empty())
        {
            int a = ans.front();
            ans.pop();
            cout << a << " ";
        }
        cout << endl;
    }
}

queue<int> modifyQueue(queue<int> q, int k)
{

    stack<int> s;
    int n = q.size();

    for (int i = 0; i < k; i++)
    {
        int elm = q.front();
        q.pop();
        s.push(elm);
    }

    while (!s.empty())
    {
        int elm = s.top();
        s.pop();
        q.push(elm);
    }

    for (int i = 0; i < n - k; i++)
    {
        int elm = q.front();
        q.pop();
        q.push(elm);
    }
    return q;
}