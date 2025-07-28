import java.util.*;
public class StringAnagram {
	public static void main(String[] args) {
		String str1="listen";
		String str2="sillent";
		char[] charArray1 = str1.toCharArray();
		char[] charArray2=str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		if (Arrays.equals(charArray1, charArray2)) {
			System.out.println("Anagram");
			
		}
		else {
			System.out.println("not an anagram");
		}
		
		
	}

}
