package assignments;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class PrintUniqueChar {

	public static void main(String[] args) {
		String input="babub";
		char[] str=input.toCharArray();
		HashSet<Character> val=new LinkedHashSet<Character>(str.length-1);
		for (Character character : str) {
			val.add(character);
		}
		for (Character c : val) {
			System.out.println(c);
		}
		}
}