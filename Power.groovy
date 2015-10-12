class Calculation {
	int base;
	int exponent;
	
	int pow() {
		if (this.exponent == 0) {
			return 1;
		}
		int output = this.base*pow(this.base,this.exponent - 1);
	}	
}
Calculation calc = new Calculation();
calc.base = 2;
calc.exponent = 3;
int result = calc.pow();



//===============================================



int pow(Calculation c) {
	if (c.exponent == 0) {
		return 1;
	}
	int output = c.base*pow(c.base,c.exponent - 1);
}	



//===============================================


class Calculation {
	int pow(int base, int exponent) {
		if (exponent == 0) {
			return 1;
		}
		int output = base * pow(base, exponent - 1);
	}	
}
Calculation calc = new Calculation();
int result = calc.pow(2,10);
