#include <bits/stdc++.h>
 
using namespace std;
 
const int MaxN = (int)1e5 + 10;
const int MOD = (int)1e9 + 7;
const int INF = 1e9;
 
struct Node {
	int to[26];
	int cnt, fin;
} t[1 << 20];
 
int n, q, ptr;
string s[MaxN], ans[MaxN];
vector < pair < string, int > > chk[MaxN];
 
void addString(const string &s) {
	int root = 0;
	for (auto &ch : s) {
		if (!t[root].to[ch - 'a']) {
			t[root].to[ch - 'a'] = ++ptr;
		}
		root = t[root].to[ch - 'a'];
	}
	t[root].fin = 1;
}
 
string getLCP(const string &s) {
	string res;
	int root = 0;
	for (auto &ch : s) {
		if (!t[root].to[ch - 'a']) {
			break;
		}
		res += ch;
		root = t[root].to[ch - 'a'];
	}
	while (!t[root].fin) {
		for (int i = 0; i < 26; ++i) {
			if (t[root].to[i]) {
				root = t[root].to[i];
				res += (char)(i + 'a');
				break;
			}
		}
	}
	return res;
}
 
int main() {
//	freopen("input.txt", "r", stdin);
	ios::sync_with_stdio(false); cin.tie(NULL);
	cin >> n;
	assert (1 <= n && n <= 1e5);
	for (int i = 0; i < n; ++i) {
		cin >> s[i];
		assert (s[i].length() >= 1 && s[i].length() <= 10);
		for (auto &ch : s[i]) {
			assert (ch >= 'a' && ch <= 'z');
		}
	}
	cin >> q;
	assert (q >= 1 && q <= 1e5);
	for (int i = 0; i < q; ++i) {
		string w;
		int r;
		cin >> r >> w;
		assert (1 <= r && r <= n);
		assert (1 <= w.length() && w.length() <= 10);
		chk[r - 1].push_back(make_pair(w, i));
	}
	for (int i = 0; i < n; ++i) {
		addString(s[i]);
		for (auto &queries : chk[i]) {
			ans[queries.second] = getLCP(queries.first);
		}
	}
	for (int i = 0; i < q; ++i) {
		cout << ans[i] << "\n";
	}
	return 0;
} 
