package com;

interface Paytm {

	void pay(int amount);

}


interface Flipkart extends Paytm {
	void buy(String product);
}
