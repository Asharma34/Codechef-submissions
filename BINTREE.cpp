#include <iostream>
using namespace std;
 
int main() {
	// your code goes here
	int n;
	cin>>n;
	for(int t=0;t<n;t++)
	{
		long i;
		long j;
		long m = 0;
		cin>>i>>j;
		while(i != j)
		{
			if(i > j)
			{
				i /= 2;
				m++;
			}
			if(i<j)
			{
				j /= 2;
				m++;
			}
		}
		cout<<m<<endl;
	}
	return 0;
} 
