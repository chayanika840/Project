#include <bits/stdc++.h>
using namespace std;

struct Node
{
    int data;
    Node *left;
    Node *right;

    Node(int val)
    {
        data = val;
        left = right = NULL;
    }
};

Node *buildTree(string str)
{
    // Corner Case
    if (str.length() == 0 || str[0] == 'N')
        return NULL;

    // Creating vector of strings from input
    // string after spliting by space
    vector<string> ip;

    istringstream iss(str);
    for (string str; iss >> str;)
        ip.push_back(str);

    // Create the root of the tree
    Node *root = new Node(stoi(ip[0]));

    // Push the root to the queue
    queue<Node *> queue;
    queue.push(root);

    // Starting from the second element
    int i = 1;
    while (!queue.empty() && i < ip.size())
    {

        // Get and remove the front of the queue
        Node *currNode = queue.front();
        queue.pop();

        // Get the current Node's value from the string
        string currVal = ip[i];

        // If the left child is not null
        if (currVal != "N")
        {

            // Create the left child for the current Node
            currNode->left = new Node(stoi(currVal));

            // Push it to the queue
            queue.push(currNode->left);
        }

        // For the right child
        i++;
        if (i >= ip.size())
            break;
        currVal = ip[i];

        // If the right child is not null
        if (currVal != "N")
        {

            // Create the right child for the current Node
            currNode->right = new Node(stoi(currVal));

            // Push it to the queue
            queue.push(currNode->right);
        }
        i++;
    }

    return root;
}

class Solution
{
public:
    // count all nodes
    int countNodes(struct Node *tree)
    {
        int ans = 0;

        if (!tree)
            return 0;

        ans = 1 + countNodes(tree->left) + countNodes(tree->right);

        return ans;
    }

    // check if it is complete binary tree
    bool isCBT(struct Node *tree, int index, int totalNodes)
    {
        if (!tree)
            return true;

        if (index >= totalNodes)
            return false;

        else
        {
            bool left = isCBT(tree->left, 2 * index + 1, totalNodes);
            bool right = isCBT(tree->right, 2 * index + 2, totalNodes);

            return (left & right);
        }
    }

    // check for max order of heap
    bool isMaxHeap(struct Node *tree)
    {
        if (tree->left == NULL && tree->right == NULL)
            return true;

        if (tree->right == NULL)
        {
            return (tree->data > tree->left->data);
        }

        else
        {
            bool left = isMaxHeap(tree->left);
            bool right = isMaxHeap(tree->right);

            return (left && right && (tree->data > tree->left->data && tree->data > tree->right->data));
        }
    }

    bool isHeap(struct Node *tree)
    {

        int index = 0;
        int totalNodes = countNodes(tree);

        if (isCBT(tree, index, totalNodes) && isMaxHeap(tree))
            return true;
        else
            return false;
    }
};

int main()
{
    int tc;
    scanf("%d ", &tc);
    while (tc--)
    {
        string treeString;
        getline(cin, treeString);
        Solution ob;
        Node *root = buildTree(treeString);
        if (ob.isHeap(root))
            cout << 1 << endl;
        else
            cout << 0 << endl;
    }

    return 0;
}