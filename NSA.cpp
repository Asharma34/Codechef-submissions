#include <iostream>
using namespace std;
 
int main() {
	// your code goes here
	int t;
	cin >> t;
	while(t--)
	{
		string s;
		cin >> s;
		int n = s.length();
		long long int info[26][n];
		for(int i=0;i<26;i++){
			for(int j=0;j<n;j++){
				info[i][j] = 0;
			}
		}
		for(int i=0;i<n;i++)
		{
			int x = (int)s[i];
			info[x-97][i] = 1;
		}
		long long int sup[26][n];
		for(int i=0;i<26;i++){
			for(int j=0;j<n;j++){
				sup[i][j] = 0;
			}
		}
		for(int i=24;i>=0;i--)
		{
			for(int j=n-2;j>=0;j--)
			{
				long long int sum = 0;
				for(int k=i+1;k<26;k++){
					sum += info[k][j+1];
				}
			       sup[i][j] = sup[i][j+1] + sum;
			}
		}
		long long int pus[26][n];
 
		for(int i=0;i<26;i++){
			for(int j=0;j<n;j++){
				pus[i][j] = 0;
			}
		}
		for(int i=1;i<26;i++){
			for(int j=1;j<n;j++){
				long long int sums = 0;
				for(int k=0;k<i;k++)
				sums += info[k][j-1];
			            pus[i][j] = pus[i][j-1] + sums;
		}
		}
 
	/*	for(int i=0;i<26;i++){
			for(int j=0;j<n;j++){
				cout << sup[i][j]<<" ";
			}
			cout<<endl;
		}*/
 
	/*	for(int i=0;i<26;i++){
			for(int j=0;j<n;j++){
				cout << pus[i][j]<<" ";
			}
			cout<<endl;
		}*/
 
		long long int sum2 = 0;
		for(int i=0;i<26;i++){
			for(int j=0;j<n;j++){
				sum2 += info[i][j] * sup[i][j];
			}
		}
		long long int min = sum2;
	//	cout << sum2 << endl;
		for(int j=0;j<n;j++)
		{
			for(int i=0;i<26;i++)
			{
				long long int eff = sum2 + abs(i - (int)s[j] + 97) + sup[i][j] + pus[i][j] - sup[(int)s[j] - 97][j] - pus[(int)s[j] - 97][j];
				if(eff < min)
				min = eff;
		//		cout << eff << " ";
			}
		}
		cout << min << endl;
	}
	return 0;
}  
