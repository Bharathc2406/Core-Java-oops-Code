package org;

class Jhon extends Student implements Hotel,Theater {

	@Override
	public void study() {
		System.out.println("studying");
	}

	@Override
	public void eatFood() {
		System.out.println("eating biryani");
	}

	@Override
	public void watchMovie() {
		System.out.println("watching");
	}
	public static void main(String[] args) {

		Jhon j = new Jhon();
		j.study();
		j.eatFood();
		j.watchMovie();
	}
}
