//method assumes discs can only move to adjacent posts
int hanoi(int i) {
	if(i == 1) {
		return 2;
	} else {
		int output = 3*hanoi(i-1) + 2;
		return output;
	}
}
print "Please insert number of discs in Hanoi Tower: "
String s = System.console().readLine()
int j = Integer.parseInt(s)
println "Number of moves required to complete tower: " + hanoi(j)