#include<iostream>
#include<map>
#include<iterator>

#define ll long long

using std::cout;
using std::map;
using std::cin;
using std::endl;
using std::pair;

inline ll maxM(ll a,ll b) {return a>b ? a : b;}

int main(){
	ll M, N,temp=0,count;
	cin >> N >> M;
	ll arr[N];
	while(temp < N){
		cin >> arr[temp++];
	}
	map<ll,ll> list;
	map<ll,ll>:: iterator it;
	for(temp = 0; temp < M; temp++){
		it = list.find(arr[temp]);
		if(it == list.end())
			list.insert(pair<ll,ll>(arr[temp],1));
		else
			it->second++;
	}
	count = list.size();
	for(temp = 0; temp < N-M; temp++){
		if(arr[temp] == arr[temp+M])
			continue;
		it = list.find(arr[temp]);
		if(it->second == 1)
			list.erase(arr[temp]);
		else
			it->second--;
		it = list.find(arr[temp+M]);
		if(it == list.end())
			list.insert(pair<ll,ll>(arr[temp+M],1));
		else
			it->second++;
		count = maxM(count,list.size());
	}
	cout << count << endl;
	return 0;
}