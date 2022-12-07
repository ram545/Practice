#include<iostream>

using std::cin;
using std::cout;
using std::endl;

#define ll long long int

inline bool compareXY(ll a, ll b, ll X, ll Y) { return (a >= X && a <= Y) || (b >= X && b <= Y); }


void populateMinMax(ll minM[],ll maxM[], ll L, ll R){
	ll sum = 0;	
	for(ll i=0; i < (R-L+1) ; i++){
		sum = sum + i;
		minM[i] = (i+1)*L + sum;
		maxM[i] = (i+1)*R - sum;
	}
}

int main(){
	ll testCases,Queries,L,R,X,Y,size;
	bool checkSequence = false;
	cin >> testCases;
	while(testCases--){
		cin >> Queries >> L >> R;
		size = R-L+1;
		ll minM[size] = {0}, maxM[size]={0};
		populateMinMax(minM,maxM,L,R);
		while(Queries--){
			cin >> X >> Y;
			for( ll i = 0 ; i < size; i++){
				if(compareXY(minM[i],maxM[i],X,Y)){
					checkSequence = true;
					break;
				}	
			}
			cout << checkSequence << endl;
			checkSequence = false;
		}
	}
	return 0;
}