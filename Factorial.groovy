/**
	Calculates the factorial of a positive integer.
	@param i any integer
	@return the resulting factorial of the integer
*/
int factorial(int i) {
	int result;
	if (i == 1) {
		result = 1;
	} else {
		result = i * factorial(i-1);
		return result;
	}
}

// Testing the above method.
int output = factorial(9);
println output;
