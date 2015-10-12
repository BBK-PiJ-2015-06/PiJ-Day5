//Iterative method
int factorialIterative(int i) {
	if (i > 0) {
		int output = 1;
		for (int count = 1; count <= i; count++) {
			output = output * count;
		}
		return output;
	} else {
		return 0;
	}
}

//Recursive method
int factorialRecursive(int i) {
	if (i == 1) {
		return 1;
	} else {
		int output = i * factorialRecursive(i - 1);
		return output;
	}
}
print "Please insert a positive integer: "
String s = System.console().readLine();
int i = Integer.parseInt(s);
println factorialIterative(i);
println factorialRecursive(i)



