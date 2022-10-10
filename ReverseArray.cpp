// Reverse an array's elements
#include <bits/stdc++.h>
using namespace std;

int main() {
    int n = 5;
    int arr[5] = {1, 2, 3, 4, 5};

    cout << "Before: ";
    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }

    int l = 0, r = n - 1;
    while (l <= r) {
        swap(arr[l], arr[r]);
        l++;
        r--;
    }

    cout << "\nAfter:  ";
    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }
    return 0;
}