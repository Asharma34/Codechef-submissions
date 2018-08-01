#include <iostream>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--)
	{
		long a;
		long b;
		cin>>a>>b;
		long count = 0;
		for(long i=a;i<=b;i++)
		{
			if((i % 10 == 2) || (i % 10 == 3) || (i % 10 == 9))
				count++;
		}
		cout<<count<<endl;
	}
	return 0;
} 
