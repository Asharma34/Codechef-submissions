#include <iostream>
#include<stdio.h>
#include <bits/stdc++.h>
 
using namespace std;
 
long long int min(long long int a, long long int b){
	return (a<b)? a: b;
}
 
 
 
long long int powe(long long int x, unsigned long long int y)
{
    long long int res = 1;// Initialize result
    x = x % 1000000007;
 
    while (y > 0) {
        // If y is odd, multiply x with result
        if (y & 1)
            res = ((res % 1000000007) * (x % 1000000007)) % 1000000007;
 
        // n must be even now
        y = y >> 1; // y = y/2
        x = ((x % 1000000007)* (x % 1000000007)) % 1000000007; // Change x to x^2
    }
    return res;
}
 
 
 
int main() {
	// your code goes here
	long long int n = 5000;
	long long int k = 5000;
	long long int C[n+1][k+1];
            long long int i, j;
 
    // Caculate value of Binomial Coefficient in bottom up manner
    for (i = 0; i <= n; i++)
    {
        for (j = 0; j <= min(i, k); j++)
        {
            // Base Cases
            if (j == 0 || j == i)
                C[i][j] = 1;
 
            // Calculate value using previosly stored values
            else
                C[i][j] = (C[i-1][j-1] % 1000000006 + C[i-1][j] % 1000000006) % 1000000006;
        }
    }
 
	int t;
	cin >> t;
	while(t--)
	{
		int N;
		int K;
		cin >> N >> K;
		int a[N];
		for(int i=0;i<N;i++)
		cin >> a[i];
		sort(a, a+N);
		long long int power[N];
		for(int i=0;i<N;i++)
		{
			power[i] = (((C[N-1][K-1] - C[N-i-1][K-1] - C[i][K-1]) % 1000000006)+1000000006)%1000000006;
 
		}
 
		long long int prod = 1;
 
		for(int i=0;i<N;i++)
		{
			prod = (prod * powe(a[i], power[i])) % 1000000007;
 
		}
		cout<< prod << endl;
	//	cout << C[5000][2500] << endl;
	}
	return 0;
}     
