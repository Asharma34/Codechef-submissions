#include <iostream>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--)
	{
		int n;
		cin>>n;
		int root = 0;
		while(n--)
		{
			int id;
			int ch_id;
			cin>>id>>ch_id;
			root += id - ch_id;
		}
		cout<<root<<endl;
	}
	return 0;
} 
