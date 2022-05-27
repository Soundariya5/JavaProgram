package week4.day4;
public class Palindrome {

	public static void main(String[] args) {
		String str="madam";
        String orig=str;
        String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+orig.charAt(i);
		}
			if(orig.equals(rev)) {
				System.out.println("Palindrome");
			}
			else
				System.out.println("Not");
	}
}

