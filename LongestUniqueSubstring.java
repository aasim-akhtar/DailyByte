//Task is to find the longest unique substring of length of atleast 3 from a string.
// Input: abcdabc , identified abcd, Output: abcd
// Input: abcbab, Identified abc but length<3 so output = -1
// Input: ababcd, ab, abcd, output abcd 

import java.util.Scanner;

public class LongestUniqueSubstring{
	static void cout(Object statement){System.out.println(statement);}
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		String str=new String(cin.nextLine());
		int position=0;
		String substr= new String(str);
		cout("You've entered:" + str);
		//To find Longest unique substring:
		for(int i=1;i<str.length();++i){
			if(str.charAt(i)==str.charAt(0)){
				position=i;
				break;
			}
		}
		substr.substring(0,position);
		cout("Longest Substring: "+ substr);
		System.out.println(substr);





		cin.close();
	}
}
