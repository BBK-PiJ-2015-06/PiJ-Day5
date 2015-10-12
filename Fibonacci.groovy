//Iterative method
int fibonacciIterative(int i) {
	int output = 1
	if (i <=2) {
		output = 1;
		return output;
	} else {
		int num1 = 1
		int num2 = 1
		for (int count = 3; count <= i; count++) {
			output = num1 + num2;
			num2 = num1;
			num1 = output;
		}
	return output;
	}	
}

//Recursive method

print "Please insert a positive integer: "
String s = System.console().readLine();
int i = Integer.parseInt(s);
println fibonacciIterative(i)