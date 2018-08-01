#include <iostream>
using namespace std;
 
int main() {
	// your code goes here
	long t;
	cin>>t;
	for(long tst=0;tst<t;tst++)
		{
			long long a;
			long long b;
			cin>>a>>b;
			if(b == 0 && a != 0) cout<<-1<<endl;
			else if(b == 1 && a != 1)
			{
				if(a == 0) cout<<1<<endl;
				else cout<<-1<<endl;
			}
				else if (a == b) cout<<0<<endl;
			else
			{
				int aone = 0;
			for(long long i=a;i>0;i/=2)
			{
				if(i%2 == 1)
				aone++;
			}
			if(b % 2 == 1)
			{
				int bone = 0;
			for(long long i=b;i>0;i/=2)
			{
				if(i%2 == 1)
				bone++;
			}
				if(bone > aone)
				cout<<(bone-aone)<<endl;
				if(bone <= aone)
				cout<<2<<endl;
			}
			if(b % 2 == 0)
			{
			int bonem1 = 0;
			for(long long i=(b-1);i>0;i/=2)
			{
				if(i%2 == 1)
				bonem1++;
			}
				if(bonem1 > aone)
				cout<<(bonem1-aone+1)<<endl;
				if(bonem1 < aone)
				cout<<2<<endl;
				if(bonem1 == aone)
				cout<<1<<endl;
			}
			
			}	
		}	
		
	return 0;
} 
