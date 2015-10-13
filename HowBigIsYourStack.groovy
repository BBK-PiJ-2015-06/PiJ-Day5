int countUp(int i) {
	println i
	int newCount = i + 1;
	countUp(newCount);	
}

countUp(1)