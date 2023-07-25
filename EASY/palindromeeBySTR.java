/*
 * convert integer to string using toString()
 * check if the string is palindrome by declare two variables
 * int i = 0 && int j = str.length()-1
 * if charAt(i) != charAt(j)return false otherwise return true
 */
class Solution {
    public boolean isPalindrome(int x) {
	    String  str = Integer.toString(x);
	    int i = 0;
	    int j = str.length()-1;
	    while(i < j) {
		    if(str.charAt(i) != str.charAt(j)) {
			    return false;
		    }
		    i++;
		    j--;
		   }
	    return true;
	   }
