boolean palindromeCheck(String s) {
	if(s.length() > 1 ) {
		if (s.substring(0,1) != s.substring(s.length()-1)) {
			return false;
		} else {
			return palindromeCheck(s.substring(1,s.length()-1));
		}
	} 
	return true
}

println "Please enter some text below: "
String str = System.console().readLine();
if(palindromeCheck(str) == true) {
	println "This is a palindrome.";
} else {
	println "This is not a palindrome.";
}