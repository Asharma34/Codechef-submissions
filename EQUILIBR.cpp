#include <iostream>
#include<bits/stdc++.h>
using namespace std;
 
 
 
long long int modInverse(long long int a, long long int m)
{
	long long int m0 = m;
	long long int y = 0, x = 1;
 
	if (m == 1)
	return 0;
 
	while (a > 1)
	{
		// q is quotient
		long long int q = a / m;
		long long int t = m;
 
		// m is remainder now, process same as
		// Euclid's algo
		m = a % m, a = t;
		t = y;
 
		// Update y and x
		y = x - q * y;
		x = t;
	}
 
	// Make x positive
	if (x < 0)
	x += m0;
 
	return x;
}
 
 
int main() {
	// your code goes here
	long long int n;
	int k;
	cin >> n >> k;
	long long int P = 1;
	long long int Q = 1;
	for(int i=1;i<=n-1;i++)
	{
		Q = (Q * 2) % 1000000007;
	}
	P = (Q - n) % 1000000007;
	if(P < 0)
	{
		P = (P + 1000000007) % 1000000007;
	}
	for(long long int i=2;i<=Q;i*=2)
	{
		if(P % i == 0 && Q % i == 0)
		{
			P /= i;
			Q /= i;
		}
	}
	long long int Qinv = modInverse(Q, 1000000007);
	long long int ans = ((P % 1000000007) * (Qinv)) % 1000000007;
	cout << ans << endl;
	return 0;
}  
