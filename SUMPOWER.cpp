#include <iostream>
#include <algorithm>
using namespace std;
 
int main() {
	// your code goes here
	long t;
	cin>>t;
	while(t--)
	{
		long n;
		long k;
		cin>>n>>k;
		string s;
		long count = 0;
		cin>>s;
		
		for(int i=0;i<n-1;i++)
		{
			if(s[i] == s[i+1]){
				long a[4];
				a[0] = i+1;
				a[1] = n-i;
				a[2] = n-k;
				a[3] = k;
				sort(a, a+4);
				if(a[0] == n-i)
				count += (a[0]-1);
				else
				count += a[0];
			}
			
		}
		
	long ans = ((n - k) * k) - count;
	cout<<ans<<endl;
	}
	return 0;
} 
