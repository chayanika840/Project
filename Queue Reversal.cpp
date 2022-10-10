#include <bits/stdc++.h>
using namespace std;
queue<int> rev(queue<int> q);
int main()
{
    int test;
    cin >> test;
    while (test--)
    {
        queue<int> q;
        int n, var;
        cin >> n;
        while (n--)
        {
            cin >> var;
            q.push(var);
        }
        queue<int> a = rev(q);
        while (!a.empty())
        {
            cout << a.front() << " ";
            a.pop();
        }
        cout << endl;
    }
}

// Function to reverse the queue using recursion
void reverse(queue<int> &q)
{
    if (q.size() == 0)
        return;

    int elm = q.front();
    q.pop();

    reverse(q);

    q.push(elm);
}
queue<int> rev(queue<int> q)
{

    reverse(q);
    return q;
}

// Function to reverse the queue using stack
queue<int> rev(queue<int> q)
{
    stack<int> s;

    while (!q.empty())
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
    return q;
}