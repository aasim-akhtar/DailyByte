	using namespace std;
	#include<iostream>
	#include<stdio.h>

	int getDigits(int);
	signed int reverseNumber(int);

	int main(){
		int num, digits;
		cout<<"Input any number: ";
		cin>>num;
		digits= getDigits(num);
		cout<<"\nNo of digits in "<<num<<"="<<digits;
		signed int reverse = reverseNumber(num);
		cout<<"\nReverse of "<<num<<"="<<reverse;

	return 0;	
	}
int getDigits(int num){
	int count=0;
	while(num!=0){
			num/=10; //Successively divides the number to get number of digits
			count++; 
	}
	return count;
}

signed int reverseNumber(int num){
	signed int rev=0;
	while(num!=0){
		rev=rev+num%10;
		num=num/10;
		cout<<"\nrev="<<rev;
		rev=rev*10;
	}
	return (rev/10);
	// last multiplication needs to be deducted in order to remove the excess multiplication
}

/*
num=456
digits=3
rev=num%10=6
rev=

*/