class PaperSize {

	double width;
	double length;
	
	//Method tests in which direction from base A0 recursion should proceed.
	void paperdims(String s){
		if (s.length() > 2) {
			s = s.substring(1);
			largerA0(s);
		} else {
			int i = Integer.parseInt(s.substring(1));
			smallerA0(i);
		}
		println this.length + "mm x " + this.width + "mm"
	}
	
	void smallerA0(int i){
		if (i == 0) {
			this.width = 841;
			this.length = 1189;
		} else {
			smallerA0(i-1)
			double temp = this.width;
			this.width = this.length / 2;
			this.length = temp;
		}
	}
	
	void largerA0(String s){
		if (s == "00") {
			this.width = 1682;
			this.length = 1189;
		} else {
			largerA0(s.substring(1));
			double temp = this.width;
			this.width = this.length * 2;
			this.length = temp;
		}
	}
}
PaperSize sheet1 = new PaperSize();
print "Please enter a paper size: ";
String s = System.console().readLine();
sheet1.paperdims(s)
